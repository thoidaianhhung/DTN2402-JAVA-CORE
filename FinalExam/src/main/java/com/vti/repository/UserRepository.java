package com.vti.repository;

import com.vti.entity.User;
import com.vti.utility.JdbcUtility;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements IUserRepository {
    @Override
    public List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role = 'EMPLOYEE' AND project_id = ?";
        try (
                Connection connection = JdbcUtility.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setInt(1, projectId);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                List<User> users = new LinkedList<>();
                while (resultSet.next()) {
                    User user = getUser(resultSet);
                    users.add(user);
                }
                return users;
            }
        }
    }

    @Override
    public List<User> findAllManager() throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE role = 'MANAGER'";
        try (
                Connection connection = JdbcUtility.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            List<User> users = new LinkedList<>();
            while (resultSet.next()) {
                User user = getUser(resultSet);
                users.add(user);
            }
            return users;
        }
    }

    @Override
    public User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_manager_by_email_and_password(?, ?)}";
        try (
                Connection connection = JdbcUtility.getConnection();
                CallableStatement callableStatement = connection.prepareCall(sql);
        ){
            callableStatement.setString(1, email);
            callableStatement.setString(2, password);
            try (ResultSet resultSet = callableStatement.executeQuery()) {
                return resultSet.next() ? getUser(resultSet) : null;
            }
        }
    }

    public User getUser(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setFullName(resultSet.getString("full_name"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setExpInYear(resultSet.getInt("exp_in_year"));
        user.setProSkill(resultSet.getString("pro_skill"));
        user.setProjectId(resultSet.getInt("project_id"));
        user.setRole(resultSet.getString("role"));
        return user;
    }
}

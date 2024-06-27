package com.vti.repository;

import com.vti.entity.User;
import com.vti.utility.JdbcUtility;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try (
                Connection connection = JdbcUtility.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
           List<User> users = new LinkedList<>();
           while (resultSet.next()) {
               User user = new User();
               user.setId(resultSet.getInt("id"));
               user.setFullName(resultSet.getString("full_name"));
               user.setEmail(resultSet.getString("email"));
               user.setPassword(resultSet.getString("password"));
               user.setRole(resultSet.getString("role"));
               user.setProSkill(resultSet.getString("pro_skill"));
               user.setExpInYear(resultSet.getInt("exp_in_year"));
               users.add(user);
           }
           return users;
        }
    }

    public int create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users(full_name, email) VALUES (?, ?)";
        try (
                Connection connection = JdbcUtility.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            return preparedStatement.executeUpdate();
        }
    }
    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?, ?)}";
        try (
                Connection connection = JdbcUtility.getConnection();
                CallableStatement callableStatement = connection.prepareCall(sql);
        ) {
            callableStatement.setString(1, email);
            callableStatement.setString(2, password);
            try (ResultSet resultSet = callableStatement.executeQuery()) {
                return resultSet.next() ? getUser(resultSet) : null;
            }
        }
    }

    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtility.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setInt(1, id);
            return pStmt.executeUpdate();
        }
    }

    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (
                Connection connection = JdbcUtility.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
        ) {
            pStmt.setInt(1, id);
            try (ResultSet rs = pStmt.executeQuery()) {
                return rs.next() ? getUser(rs) : null;
            }
        }
    }

    private User getUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }


}

package com.vti.repository;

import com.vti.entity.User;
import com.vti.utility.JdbcUtility;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
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

    public int create(String fullName, String email) {
        String sql = "INSERT INTO users(full_name, email) VALUES (?, ?)";
        try (
                Connection connection = JdbcUtility.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, email);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

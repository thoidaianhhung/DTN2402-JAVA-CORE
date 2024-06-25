package com.vti.frontend;

import com.vti.repository.UserRepository;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        UserFunction userFunction = new UserFunction(userRepository);
        userFunction.showMenu();
    }
}

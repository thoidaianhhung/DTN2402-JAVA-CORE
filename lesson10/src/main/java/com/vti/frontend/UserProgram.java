package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.repository.UserRepository;
import com.vti.service.UserService;

public class UserProgram {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService service = new UserService(userRepository);
        UserController controller = new UserController(service);
        UserFunction userFunction = new UserFunction(controller);
        userFunction.showMenu();
    }
}

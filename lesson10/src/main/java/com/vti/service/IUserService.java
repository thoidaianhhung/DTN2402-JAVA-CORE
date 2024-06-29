package com.vti.service;

import com.vti.entity.User;
import java.util.List;

public interface IUserService {
    List<User> findAll();

    int create(String fullName, String email);

    User findByEmailAndPassword(String email, String password);

    int deleteById(int id);

    User findById(int id);
}

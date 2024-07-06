package com.vti.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService {

    /**
     * @param projectId
     * @return List các user của employee
     */
    List<User> findEmployeeByProjectId(int projectId);

    /**
     * @return List các user manager
     */
    List<User> findAllManager();

    /**
     * @param email
     * @param password
     * @return User của manager
     */
    User findManagerByEmailAndPassword(String email, String password);
}

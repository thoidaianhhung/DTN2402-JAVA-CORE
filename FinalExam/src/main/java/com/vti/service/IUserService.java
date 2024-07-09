package com.vti.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService {

    /**
     * @param projectId
     * @return List các user của employee nếu không có thì trả về list rỗng
     */
    List<User> findEmployeeByProjectId(int projectId);

    /**
     * @return List các user manager nếu không có thì trả về list rỗng
     */
    List<User> findAllManager();

    /**
     * @param email
     * @param password
     * @return User của manager nếu không có trả về null
     */
    User findManagerByEmailAndPassword(String email, String password);
}

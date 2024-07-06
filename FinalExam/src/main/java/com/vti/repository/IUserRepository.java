package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /**
     * @param projectId Nhập vào project id
     * @return List các user của employee
     * @throws SQLException Xảy ra kết nối database thất bại
     * @throws IOException Xảy ra kết nối đến file database.properties thất bại
     */
    List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException;

    /**
     * @return List các user của manager
     * @throws SQLException
     * @throws IOException
     */
    List<User> findAllManager() throws SQLException, IOException;

    /**
     * @param email
     * @param password
     * @return Trả về user của manager
     * @throws SQLException
     * @throws IOException
     */
    User findManagerByEmailAndPassword(String email, String password) throws SQLException, IOException;
}

package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    /**
     * @return Tra ve tat ca user trong database
     * @throws SQLException Neu xay ra loi ve SQL
     * @throws IOException Neu xay ra loi cau hinh
     * */
    List<User> findAll() throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;

    /**
     * @param id Khoa chinh cua User
     * @return Thong tin user them id
     * @throws SQLException
     * @throws IOException
     */
    User findById(int id) throws SQLException, IOException;
}

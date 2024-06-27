package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.utility.JdbcUtility;
import com.vti.utility.ScannerUtility;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;
    public void showMenu () throws SQLException, IOException {
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách user");
            System.out.println("3. Tìm id");
            System.out.println("4. Thoát chuong trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtility.inputInt();
            if (menu == 1) {
                findByEmailAndPassword();
            } else if (menu == 2) {
                findAll();
            } else if (menu == 3) {
                findById();
            } else if (menu == 4) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            } else {
                System.err.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void showEmployeeMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm User theo id");
            System.out.println("3. Thoát chuong trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtility.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            } else {
                System.err.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void showAdminMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm User theo id");
            System.out.println("3. Thêm User");
            System.out.println("4. Xóa User theo id");
            System.out.println("5. Thoát chuong trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtility.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            }else if (menu == 5) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            } else {
                System.err.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void findAll () throws SQLException, IOException {
        List<User> users = repository.findAll();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.println("+------+-------------------------+-------------------------+");
            System.out.printf("| %-4s | %-23s | %-23s |%n", null, null, null);
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-4s | %-23s | %-23s |%n", user.getId(), user.getFullName(), user.getEmail());
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void findById() throws SQLException, IOException {
        System.out.println("Nhập vào id");
        int id = ScannerUtility.inputInt();
        User user = repository.findById(id);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (user == null) {
            System.out.println("+------+-------------------------+-------------------------+");
            System.out.printf("| %-4s | %-23s | %-23s |%n", null, null, null);
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            System.out.printf("| %-4s | %-23s | %-23s |%n", user.getId(), user.getFullName(), user.getEmail());
            System.out.println("+------+-------------------------+-------------------------+");
        }
    }

    private void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Nhập vào email:");
        String email = ScannerUtility.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtility.inputPassword();
        User user = repository.findByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf(
                    "Đăng nhập thành công: %s - %s%n",
                    user.getFullName(), role
            );
            if (role == User.Role.ADMIN) {
                showAdminMenu();
            } else if (role == User.Role.EMPLOYEE) {
                showEmployeeMenu();
            }
        }
    }

    private void create() throws SQLException, IOException {
        System.out.println("Moi ban nhap vao thong tin user");
        System.out.println("Nhap vao full name");
        String fullName = ScannerUtility.inputFullName();
        System.out.println("Nhap vao email");
        String email = ScannerUtility.inputEmail();
        int result = repository.create(fullName, email);
        System.out.printf("Da tao thanh cong %d user.%n", result);

    }

    private void deleteById() throws SQLException, IOException {
        System.out.println("Nhập vào id:");
        int id = ScannerUtility.inputInt();
        int result = repository.deleteById(id);
        System.out.printf("Đã xóa thành công %d user.%n", result);
    }
}

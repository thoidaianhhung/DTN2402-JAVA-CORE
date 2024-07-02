package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.utility.ScannerUtility;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;
    public void showMenu () {
        while (true) {
            System.out.println("1. Tìm kiếm employee theo project id");
            System.out.println("2. Hiển thị danh sách manager");
            System.out.println("3. Đăng nhập dành cho manager");
            System.out.println("4. Thoát chuong trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtility.inputInt();
            if (menu == 1) {
                findEmployeeByProjectId();
            } else if (menu == 2) {
                findAllManager();
            } else if (menu == 3) {
                findManagerByEmailAndPassword();
            } else if (menu == 4) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            } else {
                System.err.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void findEmployeeByProjectId() {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtility.inputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFull_name(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void findAllManager() {
        List<User> users = controller.findAllManager();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.println("+------+-------------------------+-------------------------+");
            System.out.printf("| %-4s | %-23s | %-23s |%n", null, null, null);
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-4s | %-23s | %-23s |%n", user.getId(), user.getFull_name(), user.getEmail());
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void findManagerByEmailAndPassword() {
        System.out.println("Nhập vào email:");
        String email = ScannerUtility.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtility.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf(
                    "Đăng nhập thành công: %s - %s%n",
                    user.getFull_name(), role
            );
        }
    }
}

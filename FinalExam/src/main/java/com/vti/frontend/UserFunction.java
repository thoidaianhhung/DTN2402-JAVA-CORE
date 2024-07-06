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
            System.out.println("1. Nhập vào project id để tìm employee");
            System.out.println("2. Tìm tất cả các manager của các project");
            System.out.println("3. Đăng nhập login vào manager");
            System.out.println("4. Thoát chương trình");
            int menu = ScannerUtility.inputInt();
            switch (menu) {
                case 1:
                    findEmployeeByProjectId();
                    break;
                case 2:
                    findAllManager();
                    break;
                case 3:
                    findManagerByEmailAndPassword();
                    break;
                default:
                    System.out.println("Cảm ơn bạn đã dùng chương trình");
                    return;

            }
        }
    }
    private void findEmployeeByProjectId() {
        System.out.println("Nhập vào project id");
        int projectId = ScannerUtility.inputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                "ID", "FULL NAME", "EMAIL", "PASSWORD", "EXP IN YEAR", "PRO SKILL", "PROJECT ID", "ROLE");
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                    "0", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                        user.getId(), user.getFullName(), user.getEmail(), user.getPassword(),
                        user.getExpInYear(), user.getProSkill(), user.getProjectId(), user.getRole());
                System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
            }
        }
    }
    private void findAllManager() {
        List<User> users = controller.findAllManager();
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                "ID", "FULL NAME", "EMAIL", "PASSWORD", "EXP IN YEAR", "PRO SKILL", "PROJECT ID", "ROLE");
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                    "0", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                        user.getId(), user.getFullName(), user.getEmail(), user.getPassword(),
                        user.getExpInYear(), user.getProSkill(), user.getProjectId(), user.getRole());
                System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
            }
        }
    }
    private void findManagerByEmailAndPassword() {
        System.out.println("Nhập vào email");
        String email = ScannerUtility.inputEmail();
        System.out.println("Nhập vào password");
        String password = ScannerUtility.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                "ID", "FULL NAME", "EMAIL", "PASSWORD", "EXP IN YEAR", "PRO SKILL", "PROJECT ID", "ROLE");
        System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        if (user == null) {
            System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                    "0", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        } else {
            System.out.printf("| %-3s | %-23s | %-23s | %-8s | %-13s | %-13s | %-13s | %-13s | %n",
                    user.getId(), user.getFullName(), user.getEmail(), user.getPassword(),
                    user.getExpInYear(), user.getProSkill(), user.getProjectId(), user.getRole());
            System.out.println("+-----+-------------------------+-------------------------+----------+---------------+---------------+---------------+---------------+");
        }
    }
}

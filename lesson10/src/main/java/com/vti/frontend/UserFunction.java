package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.utility.ScannerUtility;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;
    public void showMenu () throws SQLException {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Thêm user và password");
            System.out.println("3. Thoát chuong trình");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtility.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                create();
            } else if (menu == 3) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }  else {
                System.err.println("Vui long chon dung chuc nang");
            }
        }
    }

    private void findAll () throws SQLException {
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

    private void create() {
        System.out.println("Moi ban nhap vao thong tin user");
        System.out.println("Nhap vao full name");
        String fullName = ScannerUtility.inputFullName();
        System.out.println("Nhap vao email");
        String email = ScannerUtility.inputEmail();
        int result = repository.create(fullName, email);
        System.out.printf("Da tao thanh cong %d user.%n", result);

    }
}

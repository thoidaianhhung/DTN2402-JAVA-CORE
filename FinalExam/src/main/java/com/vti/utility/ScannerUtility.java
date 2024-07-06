package com.vti.utility;

import java.util.Scanner;

public class ScannerUtility {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String inputString() {
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = SCANNER.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số");
                System.out.println("Nhập lại");
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.out.println("Yêu cầu nhập vào email chứa ký tự @");
                System.out.println("Nhập lại");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu password từ 6 tới 12 kí tự");
                System.err.println("Nhập lại:");
            } else {
                return input;
            }
        }
    }
}

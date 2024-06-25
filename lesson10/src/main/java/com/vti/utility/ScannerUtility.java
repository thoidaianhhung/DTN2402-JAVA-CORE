package com.vti.utility;

import java.util.Scanner;

public class ScannerUtility {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String inputString() {
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }
    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yều cầu nhập vao so nguyen");
                System.err.println("Nhap lai:");
            }
        }
    }

    public static String inputFullName () {
        return inputString();
    }
    public static String inputEmail () {
        return inputString();
    }
}

package util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner scanner = new Scanner(System.in);
    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên");
                System.err.println("Nhập lại:");
            }

        }
    }
    public static int inputPositiveInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                if (Integer.parseInt(input) >= 0) {
                    return Integer.parseInt(input);
                } else {
                    System.out.println("Yêu cầu nhập vào số nguyên dương");
                    System.out.println("Nhập lại");
                }
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số float");
                System.err.println("Nhập lại:");
            }

        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số double");
                System.err.println("Nhập lại:");
            }

        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

     public static String inputEmail() {
        // Yêu cầu chứa @
        while (true) {
            String email = scanner.nextLine();
            if (email.contains("@")) {
                return email;
            } else {
                System.out.println("Yêu cầu nhập chứa ký tự @");
                System.out.println("Nhập lại:");
            }
        }
     }

     public static String inputPassword() {
        // Yêu cầu từ 6 - 12 ký tựu, ít nhất 1 ký tự viết hoa
         while (true) {
             String password = scanner.nextLine();
             if (password.length() >= 6 && password.length() <= 12 ) {
                 for (int i = 0; i < password.length(); i++) {
                     if (Character.isUpperCase(password.charAt(i))) {
                        return password;
                     }
                 }
                 System.out.println("Yêu cầu nhập vào 1 ký tự viết hoa");
                 System.out.println("Nhập lại");
             } else {
                 System.out.println("Yêu cầu nhập vào từ 6 - 12 ký tự");
                 System.out.println("Nhập lại:");
             }
         }
     }

     public static String inputFullName() {
        // Yêu cầu chỉ chứa chữ cái (Ko đặc biệt, không số)
         while (true) {
             String fullName = scanner.nextLine();
             if (hasAllAlphabetic(fullName)) {
                 return fullName;
             } else {
                 System.out.println("Yeu cầu chỉ chứa chữ cái");
                 System.out.println("Nhap lại:");
             }
         }
     }
     private static boolean hasAllAlphabetic(String s) {
         String fullName = scanner.nextLine();
         int length = fullName.length();
         for (int i = 0; i < length; i++) {
             int c = fullName.charAt(i);
             if (Character.isAlphabetic(c)) {
                 return false;
             }
         }
         return true;
     }
}

package extra.exercise_1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số thực:");
        double a = scanner.nextDouble();
        double b = a * 2.54;
        double c = a * 12;
        System.out.printf("Với %4f inch = %4.2f cm và %4f foot = %4.2f inches", a, b, a, c);
    }
}

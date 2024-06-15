package extra.exercise_1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào số giây từ 0 tới 68399,");
            int second = scanner.nextInt();
            if (second >= 0 && second <= 68399) {
                int h = second / 3600;
                int mm = second % 3600 / 60;
                int ss = second % 3600 % 60;
                System.out.printf("%02d:%02d:%02d", h, mm, ss);
                break;
            }
        }
    }
}

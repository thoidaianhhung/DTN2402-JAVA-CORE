package extra.exercise_1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào 4 số nguyên");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int min = array[0];
        for (int i = 1; i < 4; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

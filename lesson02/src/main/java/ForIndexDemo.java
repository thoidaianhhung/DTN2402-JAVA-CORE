public class ForIndexDemo {
    public static void main(String[] args) {
        // [1..10]
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        // [10..1]
        for (int i = 10; i >= 10; i--) {
            System.out.println("i = " + i);
        }

        // [2, 4, 6, 8, 10]
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("i = " + i);
        }

        // fori
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // Lặp các phần tử trong array
        int[] numbers = {4, 9 , 6, 2, 5, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i] = " + numbers[i]);
        }
    }
}

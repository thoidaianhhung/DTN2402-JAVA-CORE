import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo số nguyên ngẫu nhiên
        int n = random.nextInt();
        System.out.println("n = " + n);

        // 0 <= m < max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min <= k <= max
        // min + random.nextInt(max - min + 1)
        int max = 999;
        int min = 100;
        int k =  random.nextInt(max - min + 1) + min;
        System.out.println("k = " + k);

        // Lấy ngẫu nhiên phần tử trong mảng
        String[] fruits = {"Cam", "Quyt", "Tao", "xoai"};
        String fruit = fruits[random.nextInt(fruits.length)];
        System.out.println("fruit = " + fruit);
    }
}

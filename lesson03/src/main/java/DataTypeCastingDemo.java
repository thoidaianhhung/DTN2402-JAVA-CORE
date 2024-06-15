public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte -> short -> int -> long -> float -> double
        byte a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Narrowing
        // double -> float -> long -> int -> short -> byte

        long m = 8000000000L;
        int n = (int) m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // Chú ý
        int x = 1;
        int y = 2;
        System.out.println((double) x / y);
        System.out.println((double) (x / y));
    }
}

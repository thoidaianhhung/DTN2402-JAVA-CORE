package generic;

public class GenericDemo {
    public static void main(String[] args) {
        // quy uoc
        // T - Type
        // E - Element
        // N - Number
        // K - Key
        // V - Value

        // generic class / interface
        Dog<Integer> dog1 = new Dog<>("Long", 1);
        System.out.println("dog1 = " + dog1);
        Dog<Double> dog2 = new Dog<>("Ha", 2.5);
        System.out.println("dog2 = " + dog2);

        // generic method
        Printer.printAny(4);
        Printer.printAny(dog1);
        Printer.printAny(dog2);
        Printer.printAny(4.5);
        Printer.printAny("Hung");

        // Bounded type : gioi han kieu du lieu nhan duoc
        // Dog<String> dog3 = new Dog<>("Tùng", "ABC");

        // multiple bounds
        int max = Math.max(1, 99);
        System.out.println("max = " + max);
    }
}

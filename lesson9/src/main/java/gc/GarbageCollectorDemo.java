package gc;

public class GarbageCollectorDemo {
    public static void main(String[] args) {

        // Object null
        Dog dog1 = new Dog("Long");
        Dog dog2 = new Dog("Linh");
        dog2 = null;

        System.gc();

        // Local variable
        demo();;
        System.gc();
    }

    public static void demo() {
        Dog dog = new Dog("ABC");
    }
}

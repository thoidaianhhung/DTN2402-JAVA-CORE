package innerclass;

public class Outer {
    private int value;
    private static int count = 3;

    public Outer(int value) {
        this.value = value;
    }

    public class Inner {
        public void showInfor() {
            System.out.println("Outer value " + value);
            System.out.println("Outer count " + count);
        }
    }

    public static class Nested {
        public void showInfor() {
            // System.out.println("Outer value " + value);
            System.out.println("Outer count " + count);
        }
    }
}

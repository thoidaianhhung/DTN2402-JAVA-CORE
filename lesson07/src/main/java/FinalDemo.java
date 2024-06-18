public class FinalDemo {
    public static void main(String[] args) {
        // final ngăn không cho thay đổi giá trị
        // final property
        final double pi = 3.1415;
        // pi = 5; lỗi

        // final method class con không thể ghi đè giá trị đó
        Dog dog = new Dog();
        dog.run();

        // final class
        //Shiba shiba = new Shiba();
        //shiba.run();

        // constant
        System.out.println("Math.PI = " + Math.PI);
    }
}

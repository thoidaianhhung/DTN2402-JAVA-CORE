package inheritance;

public class InheritanceDemo {
    // Tính kế thừa
    // Mục địch: tái sử dụng code
    // Từ khóa extends

    public static void main(String[] args) {
        Duck duck = new Duck("Long", 2);
        duck.eat();

        // Từ khóa super
        duck.eat();
        System.out.println("duck.toString() = " + duck);

        // Đơn kế thừa
    }

}

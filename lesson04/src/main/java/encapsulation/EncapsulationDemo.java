package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói mục đích che dấu thông tin
        // 1. Private các thuộc tính
        // 2. Cung cap getter / setter
        Cat cat = new Cat("Long", 2);
        System.out.println("cat.getName() = " + cat.getName());
        cat.setAge(-100);
        System.out.println(cat);
    }
}

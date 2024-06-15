import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên constructor trùng với tên class
        // 2. Constructor không có kiểu trả về
        Dog dog = new Dog("Long", 2);
        System.out.println("dog " + dog);

        Dog dog2 = new Dog("Linh");
        System.out.println("Linh " + dog2);

        // Mặc định: 0 tham số
        Dog dog1 = new Dog();
        System.out.println("entity.Dog " + dog1);
    }
}

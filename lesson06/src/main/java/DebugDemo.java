public class DebugDemo {
    public static void main(String[] args) {
        // step into (f7) chạy từn câu lệnh
        // step out (f8) thoát ra hàm ngay lap tuc
        // step over next qua dòng lệnh hoặc hàm

        System.out.println("main 1");
        System.out.println("main 2");
        System.out.println("main 3");
        System.out.println("main 4");
        loop();
        System.out.println("main 5");
        System.out.println("main 6");
        System.out.println("main 7");
    }

    public static void loop() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

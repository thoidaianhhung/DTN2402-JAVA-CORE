public class OutputDemo {
    public static void main(String[] args) {
        System.out.println("\"Java\" Core");
        System.out.println("Java Core");

        // Escape characters
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> Xuống dòng
        // \t -> Tab
        System.out.print("Java Core\n");
        System.out.print("Java Core\n");

        // system out printf
        // %s: Đại diện cho string
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực
        // %c: Đại diện cho kí tự
        // %n: Đại diện cho xuống dòng
        System.out.printf("Họ tên: %s, tuổi: %d,%n", "Hùng", 20);
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 2, "hùng");
        System.out.println("+----+--------------------+");

        // Gom nhóm, lam tron
        double money = 124341515.789;
        System.out.printf("money = %.2f%n", money);
        System.out.printf("money = %,f%n", money);
        System.out.printf("money = %,.2f%n", money);
    }
}

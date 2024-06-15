public class WrapperClassDemo {
    public static void main(String[] args) {
        // Primitive       Wrapper Class
        // byte            Byte
        // short           Short
        // int             Integer
        // long            Long
        // float           Float
        // double          Double
        // char            Character
        // boolean         Boolean

        // Boxing: Primitive -> Wrapper Class
        int a = 100;
        Integer b = Integer.valueOf(a);

        // Unboxing: Wrapper Class -> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();

        // Ứng dụng
        // 1. Kiểm tra kí tự in hoa, in thường
        System.out.println("Character.isDigit('1') = " + Character.isDigit('1'));
        System.out.println("Character.toUpperCase('a') = " + Character.toUpperCase('a'));
        System.out.println("Character.isAlphabetic('@') = " + Character.isAlphabetic('@'));

        // 2. Chuyển String sang số
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println(s + 10);
        System.out.println(n + 10);
    }
}

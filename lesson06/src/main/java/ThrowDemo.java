public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {

                // Throw chủ động ném ra 1 ngoại lệ
                throw new IllegalStateException("Bạn chưa đủ 18 tuổi");
            } else {
                System.out.println("Chao mưng ban...");
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }

    }
}

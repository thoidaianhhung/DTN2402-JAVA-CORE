public class StaticDemo {
    public static void main(String[] args) {
        try {
            // Static property
            Student s1 = new Student("Long");
            System.out.println("s1 = " + s1);
            Student s2 = new Student("Quan");
            System.out.println("s2 = " + s2);
            Student s3 = new Student("Hung");
            System.out.println("s3 = " + s3);
            System.out.println("So luong hojc sinh " + Student.getCount());
        } catch (IllegalStateException exception) {
            System.out.println("exception.getMessage() = " + exception.getMessage());
        } finally {
            System.out.println("Số lượng học sinh: " + Student.getCount());
        }


        // Static method
        int max = Math.max( 100, 1);
        System.out.println("max = " + max);
    }
}

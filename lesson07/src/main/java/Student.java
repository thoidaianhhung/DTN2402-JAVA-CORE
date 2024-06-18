public class Student {

    // Từ khoa static thuộc về class (bộ nhớ dùng chung)
    private int id;
    private String name;

    private static int count;

    public Student(String name) {
        // This thuộc về đối tượng
        if (count >= 2) {
            throw new IllegalStateException("Tối đa 2 học sinh");
        }
        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

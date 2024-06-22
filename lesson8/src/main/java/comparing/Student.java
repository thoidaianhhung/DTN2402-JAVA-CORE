package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
//        if (this.id > that.id) {
//            return 1;
//        } else if (this.id < that.id) {
//            return -1;
//        }
//        return 0;
        // ASC
        // return Integer.compare(this.id, that.id);
        // DESC
        // return Integer.compare(that.id, this.id);
        // ORDER by name DESC
        // return that.name.compareTo(this.name);

        // DRDER BY ID ASC, NAME DESC
        int c1 = Integer.compare(this.id, that.id);
//        if (c1 == 0) {
//            return that.name.compareTo(this.name);
//        }
//        return c1;
        return c1 == 0 ? that.name.compareTo(this.name) : c1;
    }
}

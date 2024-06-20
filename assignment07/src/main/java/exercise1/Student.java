package exercise1;

public class Student {
    private int id;
    private String name;
    public static String college;
    public static int moneyGroup;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%5d %15s %15s %15s", id, name, college, moneyGroup);
    }
}

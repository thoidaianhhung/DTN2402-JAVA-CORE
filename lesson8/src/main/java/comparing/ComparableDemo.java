package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(7, "Huy"));
        students.add(new Student(2, "Hung"));
        students.add(new Student(4, "Long"));
        students.add(new Student(1, "Tien Anh"));
        students.add(new Student(7, "Long"));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println("student = " + student);
        }
    }
}

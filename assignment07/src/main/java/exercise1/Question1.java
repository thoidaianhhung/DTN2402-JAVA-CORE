package exercise1;

import java.util.LinkedList;
import java.util.List;

public class Question1
{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        Student s3 = new Student(3, "Nguyễn Văn C");
        Student.college = "Đại Học Bách Khoa";
        List<Student> students = new LinkedList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        for (Student student : students) {
            System.out.println(student);
        }
        Student.college = "Đại Học Công Nghệ";
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

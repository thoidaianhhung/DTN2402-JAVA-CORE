package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List<String> students = new ArrayList<>(); Yêu cầu bộ nhớ liền nhau truy xuất O(1), xóa O(n)
        List<String> students = new LinkedList<>(); // Không yêu cau bộ nhớ liền nhau truy xuât O(n), xóa O(1)

        students.add("Long");
        // ["Long"]
        students.add("Huy");
        // ["Long", "Huy"]
        students.add(0, "Đat");
        // ["Dat", "Long", "Huy"]

        System.out.println("students.size() = " + students.size());
        // 3

        // Kiem tra danh sach rong ko
        System.out.println("students.isEmpty() = " + students.isEmpty());
        // false

        System.out.println("students.get(0) = " + students.get(0));
        // Dat

        System.out.println("students.indexOf(\"Dat\") = " + students.indexOf("Dat"));
        // 0

        System.out.println("students.contains(\"Hà\") = " + students.contains("Hà"));
        // false

        students.remove(0);
        students.remove("Long");
        // Xóa dựa vào chỉ số, giá trị

        // xóa tất cả
        students.clear();
        System.out.println("students.size() = " + students.size());
    }
}

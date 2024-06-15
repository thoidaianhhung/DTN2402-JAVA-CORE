package assignment.if_else;

public class Question3 {
    public static void main(String[] args) {
        String department = "Sale";
        String answer = (department == null) ? "Nhân viên này không có phòng ban" : "Phòng ban của nhân viên này là "
                + department;
        System.out.println(answer);
    }
}

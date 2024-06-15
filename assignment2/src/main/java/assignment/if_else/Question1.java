package assignment.if_else;

public class Question1 {
    public static void main(String[] args) {
        String department = "Sale";

       if (department == null) {
            System.out.println("Nhân viên này không có phòng ban");
        } else{
            System.out.println("Phòng ban của nhân viên này là " + department);
        }
    }
}

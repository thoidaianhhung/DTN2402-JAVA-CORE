package assignment.if_else;


public class Question2 {
    public static void main(String[] args) {
        int groupCount = 2;
        if (groupCount == 0) {
            System.out.println("Nhân viên này không có group");
        } else if (groupCount == 1 || groupCount == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (groupCount == 3) {
            System.out.println("Nhân viên này là người quan trọng tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện tham gia tất cả group");
        }
    }
}

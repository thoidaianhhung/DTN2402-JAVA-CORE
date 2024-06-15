package assignment.switch_case;

public class Question6 {
    public static void main(String[] args) {
        int groupCount = 2;
        switch (groupCount) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện tham gia tất cả các group");
                break;
        }
    }
}

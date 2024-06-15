package assignment.switch_case;

public class Question7 {
    public static void main(String[] args) {
        String position = "Sale";
        switch (position) {
            case "Dev":
                System.out.println("Nhân viên này là Devoloper");
                break;
            default:
                System.out.println("Nhân viên này không phải là Devoloper");
                break;
        }
    }
}

package assignment.for_;

public class Question11 {
    public static void main(String[] args) {
        String[] departments = new String[4];
        departments[0] = "1";
        departments[1] = "Sale";
        departments[2] = "2";
        departments[3] = "Marketing";
        for (int i = 0; i < 4; i += 2) {
            System.out.println("Thông tin department thứ " +  departments[i] + " là:");
            System.out.println("Id: " + departments[i]);
            System.out.println("Name " + departments[i + 1]);
        }
    }
}

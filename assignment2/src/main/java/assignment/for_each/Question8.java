package assignment.for_each;

public class Question8 {
    public static void main(String[] args) {
        String[] accounts = new String[3];
        accounts[0] = "nguyenvanhung@gmail.com";
        accounts[1] = "hungnv";
        accounts[2] = "Dev";
        for (String account: accounts) {
            System.out.println("account = " + account);
        }
    }
}

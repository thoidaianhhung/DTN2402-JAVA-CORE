package assignment.for_;

public class Question10 {
    public static void main(String[] args) {
        String[] accounts = new String[8];
        accounts[0] = "1";
        accounts[1] = "NguyenVanA@gmail.com";
        accounts[2] = "Nguyễn Văn A";
        accounts[3] = "Sale";
        accounts[4] = "2";
        accounts[5] = "NguyenVanB@gmail.com";
        accounts[6] = "Nguyễn Văn B";
        accounts[7] = "Marketing";
        for (int i = 0; i < 8; i += 4) {
            System.out.println("Thông tin account thứ " + accounts[i] + " là:");
            System.out.println("Email: " + accounts[i + 1]);
            System.out.println("Full name: " + accounts[i + 2]);
            System.out.println("Phòng ban: " + accounts[i + 3]);
        }
    }
}

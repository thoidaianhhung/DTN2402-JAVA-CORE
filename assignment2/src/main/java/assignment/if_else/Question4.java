package assignment.if_else;

public class Question4 {
    public static void main(String[] args) {
        String position = "Sale";
        String answer = (position.equalsIgnoreCase("Dev")) ? "Đây là Developer" : "Người này không phải " +
                "Developer";
        System.out.println(answer);
    }
}

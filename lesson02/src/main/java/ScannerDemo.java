import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Mời bạn nhập vào tuổi");
        String age = scanner.nextLine();
        System.out.println("age = " + age);

        //
        scanner.nextLine();
        System.out.println("Mời bạn nhập vào ho tên");
        String fullName = scanner.nextLine();
        System.out.println("fullName = " + fullName);

        Gender gender;
        int menu = scanner.nextInt();
        
        if (menu == 1) {
            gender = Gender.NAM;
        } else {
            gender = Gender.NU;
        }
        System.out.println("gender = " + gender);
        scanner.nextLine();
        String input = scanner.nextLine();
        Gender gender1 = Gender.valueOf(input);
        System.out.println("gender1 = " + gender1);
    }
}

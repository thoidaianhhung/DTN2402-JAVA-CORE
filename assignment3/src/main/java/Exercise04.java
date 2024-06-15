import java.util.Scanner;

public class Exercise04 {
    void question01 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ là: " + count);
    }

    void question02 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự s1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào xâu kí tự s2:");
        String s2 = scanner.nextLine();
        System.out.println("Nối xâu kí tự s2 vào sau xâu s1: " + s2 + s1);
    }

    void question03 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String s = scanner.nextLine();
        String s1 = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println("Viết hoa chữ cái đầu của tên: " + s1);
    }

    void question04 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String s = scanner.nextLine();
        String[] words = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            words[i] = String.valueOf(s.charAt(i)).toUpperCase();
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println("\"Ký tự thứ " + i + " là: " + words[i] + "\"");
        }
    }

    void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ:");
        String s = scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String s1 = scanner.nextLine();
        System.out.println("Thông tin người dùng là: " + s + " " + s1);
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Người dùng nhập vào họ tên đầy đủ:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        System.out.println("Hệ thống in ra");
        StringBuilder s1 = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            s1.append(words[i]).append(" ");
        }
        System.out.println("Họ là: " + words[0]);
        System.out.println("Tên đệm là: " + s1);
        System.out.println("Tên là: " + words[words.length - 1]);
    }

    void question07() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Người dung nhập vào họ tên đầy đủ:");
        String s = scanner.nextLine();
        String s1 = s.trim();
        String[] words = s1.split(" ");
        System.out.println("Hệ thống in ra:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
    void question08() {

    }
    void question09() {}
    void question10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ 1:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ 2:");
        String s2 = scanner.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("KO");
        } else {
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(s2.length() - 1 -i)) {
                    count++;
                    System.out.println("KO");
                    break;
                }
            }
            if (count == 0) {
                System.out.println("OK");
            }
        }
    }
    void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi có ký tự a:");
        String a = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Số lần ký tự a xuất hiện: " + count);
    }
    void question12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String s = scanner.nextLine();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt(s.length() - 1 - i));
        }
        System.out.println("Kết quả chuỗi đảo ngược là:");
        System.out.println(s1);
    }

     boolean question13() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập vào một chuỗi:");
         String str = scanner.nextLine();
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                 return false;
             }
         }
         return true;
     }
     void question14() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập vào một chuỗi:");
         String s = scanner.nextLine();
         System.out.println("Nhập ký tự chuyển:");
         String a = scanner.nextLine();
         System.out.println("Nhập ký tự muốn");
         String b = scanner.nextLine();
         System.out.println("Kết quả in ra chuỗi đã được chuyển " + s.replaceAll(a, b));

     }
     void question15() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập vào một chuỗi:");
         String s = scanner.nextLine();
         String s1 = s.trim();
     }
     void question16() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập vào một chuỗi:");
         String s = scanner.nextLine();
         System.out.println("Nhập số nguyên N");
         int n = scanner.nextInt();
         if (s.length() % n != 0) {
             System.out.println("KO");
         }
     }
 }

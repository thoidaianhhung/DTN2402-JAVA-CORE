import util.ScannerUtil;

public class Program {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên");
        int n = ScannerUtil.inputInt();
        System.out.println("n = " + n);

        System.out.println("Nhập vào số nguyên dương");
        int m = ScannerUtil.inputPositiveInt();
        System.out.println("m = " + m);

        System.out.println("Nhập vào số float");
        float a = ScannerUtil.inputFloat();
        System.out.println("a = " + a);

        System.out.println("Nhập vào số double");
        double b = ScannerUtil.inputDouble();
        System.out.println("b = " + b);

        System.out.println("Nhập vào string");
        String c = ScannerUtil.inputString();
        System.out.println("c = " + c);

        System.out.println("Nhập vào email");
        String x = ScannerUtil.inputEmail();
        System.out.println("x = " + x);

        System.out.println("Nhập vào password");
        String y = ScannerUtil.inputPassword();
        System.out.println("y = " + y);

        System.out.println("Nhập vào full name");
        String z = ScannerUtil.inputFullName();
        System.out.println("z = " + z);
    }
}

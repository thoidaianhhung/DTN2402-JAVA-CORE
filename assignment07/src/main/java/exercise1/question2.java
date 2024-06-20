package exercise1;

public class question2 {
    public static void main(String[] args) {
        Student.moneyGroup = 100;
        Student.moneyGroup += 100;
        Student.moneyGroup += 100;
        System.out.println("B1: Money Group " + Student.moneyGroup);
        Student.moneyGroup -= 50;
        System.out.println("B2: Money Group " + Student.moneyGroup);
        Student.moneyGroup -= 20;
        System.out.println("B3: Money Group " + Student.moneyGroup);
        Student.moneyGroup -= 150;
        System.out.println("B4: Money Group " + Student.moneyGroup);
        Student.moneyGroup += 150;
        System.out.println("B5: Money Group " + Student.moneyGroup);
    }
}

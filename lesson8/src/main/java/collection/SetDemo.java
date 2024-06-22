package collection;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Giong List khac phan tu duy nhat
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println("set = " + set);
    }
}

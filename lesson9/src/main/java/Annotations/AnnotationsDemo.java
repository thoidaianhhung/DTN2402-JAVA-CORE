package Annotations;

import static Annotations.Math.maxV1;

@SuppressWarnings("ALL")
public class AnnotationsDemo {
    public static void main(String[] args) {
        // cu phap: @ + ten
        // Annotations giup trinh bien dich phat hien error

        // @Override
        AnnotationsDemo  demo = new AnnotationsDemo();
        System.out.println("demo = " + demo);

        // @Deprecated
        int max = maxV1(1, 7);
        System.out.println("max = " + max);

        // @SuppressWarnings

        int m = maxV1(1, 7);
        System.out.println("max = " + max);
    }

    @Override
    public String toString() {
        return "@Override  running ...";
    }
}

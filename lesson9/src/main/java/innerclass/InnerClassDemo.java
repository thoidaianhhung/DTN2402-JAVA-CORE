package innerclass;

public class InnerClassDemo {
    public static void main(String[] args) {
        // Giup code gon hon tang tinh dong goi

        // inner class
        Outer outer = new Outer(10);
        Outer.Inner inner = outer.new Inner();
        inner.showInfor();

        // nested class
        Outer.Nested nested = new Outer.Nested();
        nested.showInfor();

        // Local class
        demo();
    }

    public static void demo() {
        class Dog {
            private int age;

            public Dog(int age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "age=" + age +
                        '}';
            }
        }
        Dog dog = new Dog(2);
        System.out.println("dog = " + dog);
    }
}

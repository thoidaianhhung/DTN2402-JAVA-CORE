package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO: Last In - First Ôut
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào đỉnh stack
        stack.push(3);
        // 3
        stack.push(5);
        // [3, 5]
        stack.push(7);
        // [3, 5, 7]
        System.out.println(stack);

        // Xem phan tu o dinh
        int peek = stack.peek();
        // 7
        System.out.println(peek);
        System.out.println(stack);

        // Lay phan tu o dinh ra
        int pop = stack.pop();
        // 7
        System.out.println("pop = " + pop);
        System.out.println("stack = " + stack);
    }
}

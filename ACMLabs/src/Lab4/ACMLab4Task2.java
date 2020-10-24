package Lab4;

import java.util.Scanner;

public class ACMLab4Task2 {

    public static void main(String[] args) {

        Stack stack = new Stack();

        Scanner sc = new Scanner(System.in);

        int n;
        label:
        while (true) {

            String choice = sc.next();

            switch (choice) {
                case "push":
                    n = sc.nextInt();
                    stack.push(n);
                    System.out.println("ok");
                    break;
                case "pop":
                    try {
                        System.out.println(stack.pop());
                    } catch (RuntimeException e) {
                        System.out.println("error");
                    }
                    break;
                case "back":
                    try {
                        System.out.println(stack.back());
                    } catch (RuntimeException e) {
                        System.out.println("error");
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "clear":
                    stack.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break label;
            }
        }

        sc.close();
    }

    static class Stack {

        private int[] array;
        private int top;

        Stack() {
            array = new int[101];
            top = -1;
        }

        void push(int value) {
            array[++top] = value;
        }

        int pop() {
            if (top < 0) {
                throw new RuntimeException("StackUnderflowException");
            }
            return array[top--];
        }

        int back() {
            if (top < 0) {
                throw new RuntimeException("StackUnderflowException");
            }
            return array[top];
        }

        int size() {
            return top + 1;
        }

        void clear() {
            top = -1;
        }
    }
}

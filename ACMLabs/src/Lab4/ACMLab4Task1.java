package Lab4;

import java.util.Scanner;

public class ACMLab4Task1 {

    public static void main(String[] args) {

        Stack stack = new Stack();

        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {

            String choice = sc.next();

            if (choice.equals("push")) {
                n = sc.nextInt();
                stack.push(n);
                System.out.println("ok");
            } else if (choice.equals("pop"))
                System.out.println(stack.pop());
            else if (choice.equals("back"))
                System.out.println(stack.back());
            else if (choice.equals("size"))
                System.out.println(stack.size());
            else if (choice.equals("clear")) {
                stack.clear();
                System.out.println("ok");
            } else if (choice.equals("exit")) {
                System.out.println("bye");
                break;
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
            return array[top--];
        }

        int back() {
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

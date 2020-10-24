import java.util.LinkedList;
import java.util.Scanner;

public class ACMLab4Task1LinkedList {

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

    static class Stack{

        private LinkedList<Integer> stack;

        Stack() {
            stack = new LinkedList<Integer>();
        }

        void push(int v) {
            stack.add(v);
        }

        int pop() {
            int val = stack.getLast();
            stack.removeLast();
            return val;
        }

        int back() {
            return stack.getLast();
        }

        int size() {
            return stack.size();
        }

        void clear() {
            stack.clear();
        }
    }
}

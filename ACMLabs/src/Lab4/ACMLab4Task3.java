package Lab4;

import java.util.Scanner;

public class ACMLab4Task3 {

    public static void main(String[] args) {

        Queue queue = new Queue();

        Scanner sc = new Scanner(System.in);

        int n;
        label:
        while (true) {

            String choice = sc.next();

            switch (choice) {
                case "push":
                    n = sc.nextInt();
                    queue.push(n);
                    System.out.println("ok");
                    break;
                case "pop":
                    System.out.println(queue.pop());
                    break;
                case "front":
                    System.out.println(queue.front());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "clear":
                    queue.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break label;
            }
        }

        sc.close();
    }

    static class Queue {

        int[] array;
        int start, end;

        public Queue() {
            array = new int[101];
            start = 0;
            end = 0;
        }

        void push(int value) {
            array[end++] = value;
        }

        int pop() {
            return array[start++];
        }

        int front() {
            return array[start];
        }

        int size() {
            return end - start;
        }

        void clear() {
            start = 0;
            end = 0;
        }
    }
}

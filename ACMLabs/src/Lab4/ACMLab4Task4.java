package Lab4;

import java.util.Scanner;

public class ACMLab4Task4 {

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
                    try {
                        System.out.println(queue.pop());
                    } catch (RuntimeException e) {
                        System.out.println("error");
                    }
                    break;
                case "front":
                    try {
                        System.out.println(queue.front());
                    } catch (RuntimeException e) {
                        System.out.println("error");
                    }
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

        private int[] array;
        private int start, end;

        Queue() {
            array = new int[101];
            start = 0;
            end = 0;
        }

        void push(int value) {
            array[end++] = value;
        }

        int pop() {
            if (start == end) {
                throw new RuntimeException("QueueUnderflowException");
            }
            return array[start++];
        }

        int front() {
            if (start == end) {
                throw new RuntimeException("QueueUnderflowException");
            }
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

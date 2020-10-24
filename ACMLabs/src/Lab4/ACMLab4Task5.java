package Lab4;

import java.util.Scanner;

public class ACMLab4Task5 {

    public static void main(String[] args) {

        Dequeue dequeue = new Dequeue();

        Scanner sc = new Scanner(System.in);

        int n;
        label:
        while (true) {

            String choice = sc.next();

            switch (choice) {
                case "push_front":
                    n = sc.nextInt();
                    dequeue.push_front(n);
                    System.out.println("ok");
                    break;
                case "push_back":
                    n = sc.nextInt();
                    dequeue.push_back(n);
                    System.out.println("ok");
                    break;
                case "pop_front":
                    System.out.println(dequeue.pop_front());
                    break;
                case "pop_back":
                    System.out.println(dequeue.pop_back());
                    break;
                case "front":
                    System.out.println(dequeue.front());
                    break;
                case "back":
                    System.out.println(dequeue.back());
                    break;
                case "size":
                    System.out.println(dequeue.size());
                    break;
                case "clear":
                    dequeue.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break label;
            }
        }

        sc.close();
    }

    static class Dequeue {

        private int[] array;
        private int start, end, size;

        Dequeue() {
            array = new int[101];
            start = 0;
            end = 0;
            size = 0;
        }

        void push_front(int value) {
            if (size != 0)
                start = (start - 1 + array.length) % array.length;
            array[start] = value;
            size++;
        }

        void push_back(int value) {
            if (size != 0)
                end = (end + 1) % array.length;
            array[end] = value;
            size++;
        }

        int pop_front() {
            int tmp = array[start];
            start = (start + 1) % array.length;
            size--;
            return tmp;
        }

        int pop_back() {
            int tmp = array[end];
            end = (end - 1 + array.length) % array.length;
            size--;
            return tmp;
        }

        int front() {
            return array[start];
        }

        int back() {
            return array[end];
        }

        int size() {
            return size;
        }

        void clear() {
            size = 0;
            start = 0;
            end = 0;
        }
    }
}

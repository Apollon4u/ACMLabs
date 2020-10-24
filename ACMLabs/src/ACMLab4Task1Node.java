public class ACMLab4Task1Node {

    static class Stack {

        Node top;

        public Stack() {
            top = null;
        }

        void push(int value) {
            Node node = new Node();
//            if (node == null) {
//                System.out.println("Overflow");
//                return;
//            }
            node.data = value;
            node.link = top;
            top = node;
        }

        void pop() {
            top = top.link;
        }

        int back() {
            return top.data;
        }


    }

    static class Node {
        int data;
        Node link;
    }
}

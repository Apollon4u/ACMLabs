package Lab5;

public class ACMLab5Task5 {
    public ListNode partition(ListNode head, int x) {

        ListNode prev_head = new ListNode(0);
        ListNode prev = prev_head;
        ListNode next_head = new ListNode(0);
        ListNode next = next_head;

        while (head != null) {
            if (head.val < x) {
                prev.next = head;
                prev = prev.next;
            } else {
                next.next = head;
                next = next.next;
            }
            head = head.next;
        }

        next.next = null;
        prev.next = next_head.next;

        return prev_head.next;
    }
}

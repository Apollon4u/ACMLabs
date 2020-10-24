package Lab5;

public class ACMLab5Task7 {
    public boolean isPalindrome(ListNode head) {

        if (head == null)
            return true;

        int length = 0;
        ListNode a = head;

        while (a != null) {
            length++;
            a = a.next;
        }

        a = head;
        if (length == 1)
            return true;

        int half = (length + 1) / 2;
        ListNode b = head;
        for (int i = 0; i < half; i++)
            b = b.next;

        ListNode c = b.next;
        b.next = null;
        ListNode temp;
        while (c != null) {
            temp = c.next;
            c.next = b;
            b = c;
            c = temp;
        }

        while (a != null && b != null) {
            if (a.val == b.val) {
                b = b.next;
                a = a.next;
            } else
                return false;
        }

        return true;
    }
}

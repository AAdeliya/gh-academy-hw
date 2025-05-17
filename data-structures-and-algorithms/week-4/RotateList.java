package data-structures-and-algorithms.week-4;

public class RotateList {
    public ListNode rotateList(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            length++;
        }

        k = k % length;
        temp.next = head;

        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newTail = newTail.next;
        newTail.next = null;
        return newHead;
    }
    
}

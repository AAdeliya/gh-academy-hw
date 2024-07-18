import java.lang.classfile.components.ClassPrinter.ListNode;

public class LinkedListCycle{
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // They met! There is a cycle.
                return true;
            }
        }
        // fast pointer reached null or fast.next is null, which means end of the
        // linked list. So, there is no cycle in the linked list – return false. :)
        return false; 
    }
}

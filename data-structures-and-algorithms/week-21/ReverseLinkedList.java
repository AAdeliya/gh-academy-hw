import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode next = null;
    ListNode cur = head;

    while (cur != null) {
        next = cur.next; //save the next node
        cur.next = prev; //reverse the link
        prev = cur; ///move prev to cur
        cur = next; //mode cur to the next ode (which was seved earclier)

    }
    return prev; //return the new head of the reversed list 
}
}

// public ListNode reverseList(ListNode head) {
//     retutn reverseListRecursive(head, null);
// }
// //recursion approach 
// public ListNode reverseList(ListNode currentNode, ListNode newNext ) {
//     i (currentNode == null ) return newNext;
//     ListNode oldNext  = currentNode.next;
//     currentNode.nezt = newNext;
//     return reverseList(oldNext, currentNode);


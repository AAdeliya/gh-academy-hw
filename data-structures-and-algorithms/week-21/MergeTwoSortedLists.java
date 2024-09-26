import java.lang.classfile.components.ClassPrinter.ListNode;

public class MergeTwoSortedLists {
    public ListNode MergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } if (l2 == null) {
            return l1;
        }

        if (l1.val<l2.val) {
            l1.next = MergeTwoSortedLists(l1.next, l2);
            return l1;
        } 

        l2.next = MergeTwoSortedLists(l1, l2.next);
        return l2;
        
    }
    
}

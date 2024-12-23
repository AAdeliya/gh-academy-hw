import java.lang.classfile.components.ClassPrinter.ListNode;


public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeAllList(list, 0, lists.length-1);
    }

    private ListNode mergeAllList(ListNode[] lists, int left, int right) {
        //call this function recursively 
        
        if (left > right) 
        return null;
        if (left == right) return lists[left];

        int middle = (right+left)/2;

        ListNode merged_left_half_lists = mergeAllList(lists, left, middle);
        ListNode merged_right_lists = mergeAllList(lists, middle+1 right);

        return mergeTwoSortedList(merged_left_half_lists, merged_right_lists);

    }

    private ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val < l2.val) {
            l1.next = mergeTwoSortedList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedList(l1, l2.next); 
            return l2;
        }
        
        //the bigger large space consuption when we merge two list in the end
    }
}


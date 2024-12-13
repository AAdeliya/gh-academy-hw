package data-structures-and-algorithms.week - 25;

public class InsertionSortList {
    public ListNode insertionSortList (ListNode head) {
        for (ListNode cur = head; cur != null; cur = cur.next) {
            for (ListNode j = head; j!= cur; j = j.next) {
                if (j.val > cur.val) {
                    int t = j.val;
                    j.val = cur.val;
                    cur.val = t;
                }
            }
        }

        return head;
    }

    
}

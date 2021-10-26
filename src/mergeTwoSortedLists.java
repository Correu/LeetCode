import java.util.LinkedList;

/*
    Problem 21
 */
public class mergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortedList = new ListNode();
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        //while(l1 != null && l2 != null)
            
        return sortedList;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

import java.util.List;

/*
    Problem 2
 */
public class addTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode s = l1, t = l2, curr = dummyNode;
        int carry = 0;
        while(s != null || t != null) {
            int x = (s != null) ? s.val : 0;
            int y = (t != null) ? t.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            if(s != null) s = s.next;
            if(t != null) t = t.next;
        }
        if(carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(321);
        ListNode node2 = new ListNode(432);
        ListNode returnNode = addTwoNumbers(node1, node2);
        System.out.println(returnNode.toString());
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        int carry = 0;
        while(temp1!=null || temp2!=null ){
            int val1 = (temp1 != null) ? temp1.val : 0; // condition ? true : false
            int val2 = (temp2 != null) ? temp2.val : 0;
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode k = new ListNode(digit);
            temp.next = k;
            temp = temp.next;
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
            if (carry != 0) {
            temp.next = new ListNode(carry);
            }

        }
        ListNode result = reverse(dummy.next);
        return result;
        
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}
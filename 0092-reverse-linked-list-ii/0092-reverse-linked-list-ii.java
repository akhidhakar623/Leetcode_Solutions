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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        
        ListNode temp = dummy;
        dummy.next = head;

        for (int i = 1; i <=left - 1; i++) {
            temp = temp.next;
        }
        ListNode tail1 = temp;
        ListNode head2 = temp.next;
        for (int i = 1; i <= right-left+1; i++) {
            temp = temp.next;
        }
        ListNode tail2 = temp;
        ListNode head3 = temp.next;

        tail1.next = null;
        tail2.next = null;


        ListNode prev = null;
        ListNode curr = head2;
        ListNode fwd = null;
        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;
    }
}
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

        ListNode l = head;

        for (int i = 1; i < left - 1; i++) {
            l = l.next;
        }

        ListNode m;
        
        if (left == 1) {
            m = head;
        } else {
            m = l.next;
        }
        ListNode r = head;
        for (int i = 1; i < right; i++) {
            r = r.next;
        }

        ListNode rr = r.next;
        r.next = null;


        ListNode prev = null;
        ListNode curr = m;

        while (curr != null) {
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        if (left == 1) {
            head = prev;
        } else {
            l.next = prev;
        }

        m.next = rr;

        return head;
    }
}
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while( fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode pre = null;
        ListNode curr = slow;
        ListNode fwd = slow;
        while(curr!=null){
            fwd = curr.next;
            curr.next =pre;
            pre=curr;
            curr=fwd;
        }
        ListNode i = head;
        ListNode j = pre;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!=null && j!=null){
            k.next = i;
            i = i.next;
            k = k.next;
            k.next = j;
            j = j.next;
            k = k.next;
        } 
        if (i != null) k.next = i;
        if (j != null) k.next = j;
    }
}
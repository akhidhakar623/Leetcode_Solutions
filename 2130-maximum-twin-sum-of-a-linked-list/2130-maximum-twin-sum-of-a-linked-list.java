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
    public int pairSum(ListNode head) {
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
        int max = Integer.MIN_VALUE;
        while(i!=null && j!=null){
            int k = i.val+j.val;
            if(k>max) max = k;
            i = i.next;
            j= j.next;
        }
        return max;
    }
}
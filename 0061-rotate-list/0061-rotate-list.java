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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        int length=0;
        ListNode temp =head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        k = k % length;
        if(k == 0) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i =1;i<=k;i++){
            fast = fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next;
        }
        ListNode newhead = slow.next;
        slow.next = null;
        fast.next = head;
        return newhead;
    }
}
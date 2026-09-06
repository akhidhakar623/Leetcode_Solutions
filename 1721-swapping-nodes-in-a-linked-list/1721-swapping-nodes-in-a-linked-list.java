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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode end = head;
        for(int i =1;i<k;i++){
            slow = slow.next;
            end = end.next;
        }
        while(end.next != null){
            end = end.next;
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;
        return head;
    }
}
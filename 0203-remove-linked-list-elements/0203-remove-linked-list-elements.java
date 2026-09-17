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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode temp1 = dummy;
        while(temp!=null){
            if(temp.val == val){
                temp = temp.next;
            }
            else{
                temp1.next = temp;
                temp1 = temp1.next;
                temp = temp.next;
            }
        }
        temp1.next = null;
        return dummy.next;
        
    }
}
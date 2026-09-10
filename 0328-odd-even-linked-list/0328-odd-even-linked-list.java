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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        int i =1;
        ListNode dummy = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp1 = dummy;
        ListNode temp2 = dummy2;
        ListNode temp = head;
        while(temp!=null){
            if(i%2 !=0){
                temp1.next = temp;
                temp1=temp1.next;
                i++;
            }
            else{
                temp2.next = temp;
                temp2 = temp2.next;
                i++;
            }
            temp = temp.next;
        }
        temp2.next = null;
        temp1.next = dummy2.next;
        return dummy.next;
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode temp = head;
        for(int i =1;i<k;i++){
             if(temp == null) return head;
            temp= temp.next;
        }
        if(temp == null) return head;
        ListNode temp2 = temp.next;
        temp.next = null;

        ListNode result = reverse(head);
        ListNode nextgroup =reverseKGroup(temp2,k);
        ListNode temp3 = result;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        temp3.next = nextgroup;

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
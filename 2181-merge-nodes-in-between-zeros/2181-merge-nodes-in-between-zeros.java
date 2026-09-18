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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy= new ListNode(-1);
        ListNode temp = head.next;
        ListNode temp2 = dummy;
        int sum = 0;
        while(temp!=null){
            if(temp.val !=0){
                sum+=temp.val;
            }
            else{
                ListNode k= new ListNode(sum);
                temp2.next = k;
                sum = 0;
                temp2 =temp2.next; 
            }
            temp = temp.next;

        }

        return dummy.next;
    }
}
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = reverse(head);
        int max = curr.val;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(curr!=null){
            if(curr.val >= max) {
                max = curr.val;
                temp.next = curr;
                temp = temp.next;
            }
            curr = curr.next; 
    }
    temp.next = null;
    return reverse(dummy.next);
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
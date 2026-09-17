
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1!=null || temp2!=null ){
            int val1 = (temp1 != null) ? temp1.val : 0; // condition ? true : false
            int val2 = (temp2 != null) ? temp2.val : 0;
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ListNode k = new ListNode(digit);
            temp.next = k;
            temp = temp.next;
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
            if (carry != 0) {
            temp.next = new ListNode(carry);
            }

        }
        return dummy.next;
    }
}

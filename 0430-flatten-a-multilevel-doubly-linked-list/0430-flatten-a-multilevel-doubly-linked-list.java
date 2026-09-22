/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node temp = head;
        while(temp!= null){
            if(temp.child!=null){
                 Node a = temp.next;
                 Node b = flatten(temp.child);
                 temp.next = b;
                 b.prev  = temp;
                 temp.child = null;

                 Node last = b;
                 while(last.next!=null){
                    last = last.next;
                 }
                 last.next = a;
                 if (a != null) {
                 a.prev = last;
                 }
                 
            }
            temp = temp.next;
        }

        return head;
        
    }
}
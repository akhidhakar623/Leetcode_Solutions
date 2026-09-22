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

        // Har node ko check karenge
        while (temp != null) {

            if (temp.child != null) {

                // Original next ko save kar lo
                Node a = temp.next;

                // Child list ko recursively flatten karo
                Node b = flatten(temp.child);

                // Current node → child list
                temp.next = b;
                b.prev = temp;

                // Child pointer hata do
                temp.child = null;

                // Child list ka last node find karo
                Node last = b;
                while (last.next != null) {
                    last = last.next;
                }

                // Flattened child list --> original next
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
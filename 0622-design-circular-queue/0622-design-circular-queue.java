class MyCircularQueue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    int capacity;
    int size;
    Node front;
    Node rear;
    int k;

    public MyCircularQueue(int k) {
        this.k = k;
        capacity = k;
        size = 0;
        front = null;
        rear = null;

    }
    
    public boolean enQueue(int value) {
        if(size == k) return false;
        Node dummy = new Node(value);

        if(front == null){
            front = rear = dummy;
            dummy.next = front;
        }
        else{
            rear.next = dummy;
            rear = dummy;
            dummy.next = front;
        }
        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(size == 0) return false;
        
        if(front == rear){ 
        front = rear = null;
        }
        else{
            front = front.next;
            rear.next = front;
        }
        size--;
        return true;
        
    }
    
    public int Front() {
        if(size==0) return -1;
        return front.data;
        
    }
    
    public int Rear() {
        if(size==0) return -1;
        return rear.data;
        
    }
    
    public boolean isEmpty() {
        if(front == null) return true;
        else{
            return false;
        }
        
    }
    
    public boolean isFull() {
        if(capacity == size) return true;
        else{
            return false;
        }
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
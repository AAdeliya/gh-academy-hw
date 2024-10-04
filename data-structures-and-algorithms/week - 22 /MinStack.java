

public class MinStack {
    private Node head;

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);

        } else {
            head = new Node(x, Math.min(x, head.min), x);

        }
    }

    public int pop() {
        return head.next;
    }
    
    public void pop() {
        return head.val;
    }
    
    public int min() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }


    
}

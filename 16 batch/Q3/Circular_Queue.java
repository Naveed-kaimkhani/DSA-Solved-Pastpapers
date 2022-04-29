interface LinkedListCircular_Queue {
    public void EnQueue(Object obj);


    public Object DeQueue();


}

public class Circular_Queue implements LinkedListCircular_Queue {
    Node head = new Node();
    int size;

    public class Node {
        Object data;
        Node next;
        Node prev;

        Node() {
        }

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void EnQueue(Object data) {
        if (this.head.next == null) {
            head.next = new Node(data);
            head.prev = head.next;
            ++size;
            System.out.println(data + " added ");
        } else {
            head.prev = head.prev.next = new Node(data, head, head.prev);
            ++size;
            System.out.println(data + " added ");
        }
    }

    @Override
    public Object DeQueue() {
        if (head.next == null) {
            throw new IllegalStateException("Circular_Queue is empty");
        } else {
            head.next = head.next.next;
            --size;
        }
        return head.next.data;
    }

    public void toStrin() {
        if (head.next == null)
            throw new IllegalStateException("Circular_Queue is empty");

        else {
            for (Node i = head.next; i != head.prev.next; i = i.next) {
                System.out.print(i.data + " ");
            }
        }
    }
    public static void main(String[] args) {
        Circular_Queue que = new Circular_Queue();
        que.EnQueue(2);
        que.EnQueue(4);
        que.EnQueue(6);
     
    }
}
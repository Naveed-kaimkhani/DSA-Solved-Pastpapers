public class Stack {
    Node top;
    int size;

    Stack() {
        this.top = top;
    }

    class Node {
        Object data;
        Node link;

        Node() {
        }

    }

    public void push(Object x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Heap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;

        top = temp;
        size++;
    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);


    }
}
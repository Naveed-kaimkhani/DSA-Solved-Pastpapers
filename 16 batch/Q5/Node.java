public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node() {
    }

    public static void Print(Node n) {
        for (Node i = n; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }

    public static int Length(Node n) {
        // Node p=n;
        int length = 0;
        for (Node p = n; p != null; p = p.next) {
            length++;
        }
        return length;
    }

    public void deleteThirdNode(Node n) {
        Node i;
        int j = 0;
        for (i = n; i.next.next != null; i = i.next) {
            if (j == 3) {
                i = null;
                break;
            }
            j++;
        }
    }

    public void InsertAtMid(Node n, int data) {
        Node i;
        int j = 0;
        int len = Length(n);
        int mid = ((len % 2) == 0) ? (len / 2) : (len + 1) / 2;
        for (i = n; i.next != null; i = i.next) {
            if (j == mid) {
                break;
            }
            j++;
        }
        Node temp = new Node(data, i.next);
        i.next = temp;

    }

    public static void main(String[] args) {
        Node start = new Node(30);
        Node n = start;
        n.next = new Node(60);
        n = n.next; // Node Start=new Node(1);
        n.next = new Node(90); // Start.next=new Node(2);
        n = n.next; // Start.next.next=new Node(3);
        n.next = new Node(120);

        Node start2 = new Node(150);
        Node p = start2;
        p.next = new Node(180);
        p = p.next;
        p.next = new Node(210);
        p = p.next;

    }
}
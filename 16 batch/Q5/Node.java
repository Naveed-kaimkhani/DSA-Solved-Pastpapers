public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next= next;
    }

    Node() {
    }

    public static void Print(Node n) {
        for (Node i = n; i != null; i = i.next) {
            System.out.print(i.data+" ");
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

    public static void deleteThirdNode(Node n) {
        Node i=n;
       //System.out.println( Length(i));
      //  i.next.next=i.next.next.next;
        // int j = 0;
        // for (i = n; i.next != null; i = i.next) {
        //     if (j == 2) {
        //         i.next=i.next.next;
        //         break;
        //     }
        //     j++;
    //     // }
        for (int j = 1; j <= 2; j++) {
            i=i.next;
        }
       i=i.next.next;
        System.out.println();
        System.out.println("\nAfter deleting third node");
        //Print(i.Length(n));
           // System.out.println(Length(n));
            Print(n);
        }

    public static void InsertAtMid(Node n, int data) {
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
                Print(i);
    }

    public static void main(String[] args) {
        Node start = new Node(30);
        Node n = start;
        n.next = new Node(60);
        n = n.next; // Node Start=new Node(1);
        n.next = new Node(90); // Start.next=new Node(2);
        n = n.next; // Start.next.next=new Node(3);
        n.next = new Node(120);
        
        System.out.println("Length of Linked List is " + Length(start));
        ///System.out.println("Deleting third node");
        Print(start);
       //deleteThirdNode(start);
        //  System.out.println("\nAfter deleting third node");
        // Print(start);
    InsertAtMid(start, 50);    
    }
}
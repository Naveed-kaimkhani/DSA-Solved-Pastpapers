public class Q1_b_i {
    Node top;
    int size;

    Q1_b_i() {
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
        // if (temp == null) {
        // System.out.println("Heap Overflow");
        // return;
        // }
        temp.data = x;
        temp.link = top;

        top = temp;
        size++;
    }

    public static String reverse(String s) {
        Q1_b_i Store_String = new Q1_b_i();
        String Reversed_String = "";
        for (int i = 0; i < s.length(); i++) {
            Store_String.push(s.charAt(i));
        }

        Node temp = Store_String.top;
        while (temp != null) {
            Reversed_String += temp.data;
            temp = temp.link;
        }
        return Reversed_String;
    }

    public static void PrintStack(Q1_b_i stack) {
        Node temp = stack.top;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        Q1_b_i obj = new Q1_b_i();
        String s = "Naveed";
        String Reverse_s = reverse(s);
        System.out.println(Reverse_s);
    }
}

public class Q1_b {
    Node top;
    int size;

    Q1_b() {
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


public void reverse(String s){
    Q1_b Store_String = new Q1_b();

    for (int i = 0; i <=s.length(); i++) {
        Store_String.push(s.charAt(i));
    }
    toString(Store_String);
}

    public static void main(String[] args) {
        Q1_b obj = new Q1_b();
    
    }        
    }

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


public static String reverse(String s){
    Q1_b Store_String = new Q1_b();
    String Reversed_String="";
    for (int i = 0; i <s.length(); i++) {
        Store_String.push(s.charAt(i));
    }
      
    Node temp = Store_String.top;
    while (temp != null) {
        Reversed_String+=temp.data;
        temp = temp.link;
    }
    return Reversed_String;
}

// public static Object pop(Q1_b stack) {
//     Object s="";
//     if (stack.top == null) {
//         System.out.println("Stack is null");
//         return -1;
//     }
//     Node temp = stack.top;
//     while (temp != null) {
//         s+=temp.data;
//         temp = temp.link;
//     }
//     return s;
// }
public static void PrintStack(Q1_b stack){
    Node temp = stack.top;
    while (temp != null) {
        System.out.print(temp.data);
        temp = temp.link;
    }
}
    public static void main(Object[] args) {
        Q1_b obj = new Q1_b();
    String s="Naveed";
     String Reverse_s =reverse(s);
    }        
    }

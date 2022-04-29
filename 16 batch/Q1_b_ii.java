public class Q1_b_ii {
    Node top;
    int size;

    Q1_b_ii() {
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

 
    public void pop() {
        if (top == null) {
            System.out.println("Stack is null");
            //return -1;
        }
        top = top.link;
        size--;
       // return top.data;
    }

    public static void PrintStack(Q1_b_ii stack) {
        Node temp = stack.top;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.link;
        }
    }
    public boolean Check_Validity(String s) {
       Q1_b_ii stack=new Q1_b_ii();
       for (int i = 0; i <s.length(); i++) {
           if (s.charAt(i)=='{') {
               stack.push('{');
           }
           else if(s.charAt(i)=='}'){
                stack.pop();
           }
       }
      if (stack.size==0) {
          return true;
      } else {
          return false;
      }
    }
    public static void main(String[] args) {
        Q1_b_ii obj = new Q1_b_ii();
        String s="{} {{{}}}";
     System.out.println(obj.Check_Validity(s));    
    }
}

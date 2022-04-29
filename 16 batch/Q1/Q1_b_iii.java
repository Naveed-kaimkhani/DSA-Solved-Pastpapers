public class Q1_b_iii {
    Node top;
    int size;

    Q1_b_iii() {
        this.top = top;
    }

    class Node {
        Object data;
        Node link;

        Node() {
        }

    }

    public static void RpnNotation(String[] s) {
        Q1_b_iii stack = new Q1_b_iii();
        String input;
        for (String expression1 : s) {
            input = expression1;
            if (isAnOperator(input)) {
                Double y =Double.valueOf(stack.pop().toString());
                Double x = Double.valueOf(stack.pop().toString());
                Double z = evaluate(x, y, input);
                String a = z.toString();
                stack.push(a);
            } else
                stack.push(input);
        }
    }

    private static double evaluate(double x, double y, String op) {
        Double z = null;
        switch (op) {
            case "A":
                z = x + y;
                break;
            case "S":
                z = x - y;
                break;
            case "M":
                z = x * y;
                break;
            case "D":
                z = x / y;
                break;
            default:
                break;
        } // switch ends
        System.out.println(x + " " + op + " " + y + " = " + z);
        return z;
    } // evaluate() ends

    private static boolean isAnOperator(String op) {
        return (op.length() == 1 && "DMAS".contains(op));
    }

    public Object pop() {
        if (top == null) {
            System.out.println("Stack is null");
            return -1;
        }
        top = top.link;
        size--;
        return top.data;
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
        Q1_b_iii obj = new Q1_b_iii();
        String[] arr = { "2", "4", "D", "3", "4", "M", "A" };
        RpnNotation(arr);
    }
}

public class Q2_a {
    public void Tower_of_Hanoi(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        Tower_of_Hanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        Tower_of_Hanoi(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        Q2_a obj = new Q2_a();
        obj.Tower_of_Hanoi(3, 'A', 'B', 'C');
    }
}

public class Recursion {
    public static void methods(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            methods(n - 1);
        }
    }

    public static void main(String args[]) {
        int n = 5;
        methods(n);
    }
}
//stack height logn
public class que1 {
    public static int printx(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printx(x, n / 2) * printx(x, n / 2);
        } else {
            return printx(x, n / 2) * printx(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        System.out.println(printx(2, 5));
    }
}
//stack height n
public class que {
    public static int printx(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int pownm1 = x * printx(x, n);
        int pown = x * pownm1;

        return pown;
    }

    public static void main(String args[]) {
        System.out.println(printx(2, 5));
    }
}
public class Factorial {
    public static int printfact(int n, int fact) {
        if (n == 1) {
            fact *= n;
            System.out.println(fact);
            return 1;
        }
        fact *= n;
        return printfact(n - 1, fact);
    }

    public static void main(String args[]) {
        printfact(3, 1);
    }
}

import java.util.*;

public class Functions2 {
    public static void calFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Statement");
            return;
        }
        int factorial = 1;
        for (i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calFactorial(n);

    }
}
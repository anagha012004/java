import java.util.Scanner;

public class PrimeNotPri {
    public static void main(String args[]) {
        int num, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }

        }
        System.out.println(count);
        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
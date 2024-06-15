import java.io.*;
import java.util.*;

public class StringsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String a = A.substring(0, 1).toUpperCase() + A.substring(1);
        String b = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(a + " " + b);
    }
}

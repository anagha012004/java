import java.io.*;
import java.util.*;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean palindrome = true;
        String rev = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            rev = rev + A.charAt(i);
        }
        if (rev.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

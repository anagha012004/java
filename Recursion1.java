import java.util.*;

public class Recursion1 {
    public static void printNum(int n) {
        if (n == 6) {
            return;
        } else {
            System.out.println(n);
            printNum(n + 1);
        }
    }

    public static void main(String args[]) {
        int n = 1;
        printNum(n);
    }
}

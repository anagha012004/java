import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class BigIntegerDemo {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String Numone = sc.nextLine();
        String Numtwo = sc.nextLine();
        BigInteger bignumone = new BigInteger(Numone);
        BigInteger bignumtwo = new BigInteger(Numtwo);
        System.out.println(bignumone.add(bignumtwo));
        System.out.println(bignumone.multiply(bignumtwo));
    }
}
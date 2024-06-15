import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] strings = s.split("[^a-zA-z]+");
        System.out.println(strings.length);

        for (String str : strings) {
            System.out.println(str);
        }

    }
}

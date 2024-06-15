import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        for (int i : cars) {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            System.out.println(i);
        }
    }
}

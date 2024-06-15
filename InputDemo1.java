import java.util.*;

public class InputDemo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sc.nextFloat();
        System.out.println("Enter second number:");
        float b = sc.nextFloat();
        float c = a + b;
        System.out.println("sum of first and second number is: " + c);

    }
}

//program to demonstarte assignment operators in java
import java.util.*;

class AssignmentOperators {
    public static void main(String args[]) {
        int x = 10, y = 20;
        x += y;
        System.out.println("sum" + x);
        x -= y;
        System.out.println("subtraction" + x);
        x *= y;
        System.out.println("multiplication" + x);
        x /= y;
        System.out.println("division" + x);
        x %= y;
        System.out.println("modulus" + x);
    }
}

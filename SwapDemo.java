import java.util.*;

class SwapDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swap:" + x + " " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap:" + x + " " + y);
    }
}
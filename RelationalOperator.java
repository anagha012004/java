import java.util.Scanner;

class RelationalOperator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println(a + " is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
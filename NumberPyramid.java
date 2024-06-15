import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the pyramid:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array of integers
        int[] numbers = { 54, 23, 12, 45, 78, 32, 90, 87, 64, 29 };

        // Prompt user to enter the number to search
        System.out.print("Enter the number to search: ");
        int searchKey = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(numbers, searchKey);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + searchKey + " found at index " + index);
        } else {
            System.out.println("Element " + searchKey + " not found in the array.");
        }

        scanner.close();
    }

    // Method for linear search
    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }
}

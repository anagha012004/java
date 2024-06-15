import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = { 54, 23, 12, 45, 78, 32, 90, 87, 64, 29 };

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted Array (Ascending Order): " + Arrays.toString(numbers));

        // To sort in descending order, you can use a custom comparator or reverse the
        // array after sorting
        // Note: Sorting in descending order requires Java 8 or later
        Arrays.sort(numbers);
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // Display the array after sorting in descending order
        System.out.println("Sorted Array (Descending Order): " + Arrays.toString(numbers));
    }
}

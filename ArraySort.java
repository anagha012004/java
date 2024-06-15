import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = { 23, 34, 5, 6, 34, 66 };
        System.out.println("original array:" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("\n Ascending order:" + Arrays.toString(numbers));
        Arrays.sort(numbers);

        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
        System.out.println("Descending Order:" + Arrays.toString(numbers));
    }
}
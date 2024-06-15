
// File: MainProgram.java
import MyPackage.Calculator;

public class MainProgram {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using the Calculator class from the user-defined package
        int sum = Calculator.add(num1, num2);
        int difference = Calculator.subtract(num1, num2);

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

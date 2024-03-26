import Arithmetic.Arithmetic;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first number
        System.out.print("Please enter the first number: ");
        Number num1 = getInput(scanner);

        // Get user input for the second number
        System.out.print("Please enter the second number: ");
        Number num2 = getInput(scanner);

        // Create an instance of Arithmetic class with user input numbers
        Arithmetic<Number, Number> arithmetic = new Arithmetic<>(num1, num2);

        // Test arithmetic operations
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());

        scanner.close();
    }

    // Method to get user input and handle exceptions
    private static Number getInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the input buffer
            }
        }
    }
}

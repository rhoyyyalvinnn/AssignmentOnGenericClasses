import Arithmetic.Arithmetic;
import Map.MyMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Testing Arithmetic class
        testArithmetic();

        // Testing MyMap class
        testMyMap();
    }

    private static void testArithmetic() {
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

    private static void testMyMap() {
        // Create a MyMap instance
        MyMap<String, Integer> myMap = new MyMap<>();

        // Add key-value pairs
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Retrieve values
        System.out.println("Value for key 'two': " + myMap.get("two"));
        System.out.println("Value for key 'four': " + myMap.get("four")); // Should return null

        // Remove a key-value pair
        System.out.println("Removing key 'two': " + myMap.remove("two"));
        System.out.println("Value for key 'two': " + myMap.get("two")); // Should return null
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

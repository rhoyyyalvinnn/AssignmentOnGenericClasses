import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        // Testing Arithmetic
        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(10, 3.5);
        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());

        // Testing MyMap
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        System.out.println("Value for key 'two': " + myMap.get("two"));
        System.out.println("Removing key 'two': " + myMap.remove("two"));
        System.out.println("Value for key 'two': " + myMap.get("two")); // Should return null
    }
}

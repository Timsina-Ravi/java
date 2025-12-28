package Java8.FunctionalInterface.Types;

import java.util.function.Supplier;

/*
 * 🔹 Supplier<T> --> Provides a value of type T
 *
 * Theory:
 *  - Takes no arguments, returns a result
 *  - Used for generating values, lazy initialization
 *
 * Built-in methods:
 *  - get() -> Returns the supplied value
 */

public class SupplierExample {
    public static void main(String[] args) {

        // Supplier to return a random number
        Supplier<Double> randomNumber = () -> Math.random();

        // Supplier to return a fixed string
        Supplier<String> helloSupplier = () -> "Hello World";

        // Use get() to fetch values
        System.out.println("Random number: " + randomNumber.get());
        System.out.println("Message: " + helloSupplier.get());
    }
}

package Java8.FunctionalInterface.Types;

import java.util.function.Consumer;

/*
 * 🔹 Consumer<T> --> Performs an action on the given input
 *
 * Theory:
 *  - Takes one argument and returns nothing (void)
 *  - Used for printing, logging, updating values, etc.
 *
 * Built-in methods:
 *  - accept(T t)           -> Performs action on the input
 *  - andThen(Consumer other) -> Chains multiple consumers
 */

public class ConsumerExample {
    public static void main(String[] args) {

        // Consumer to print a string
        Consumer<String> print = s -> System.out.println("Value: " + s);

        // Consumer to print in uppercase
        Consumer<String> printUpper = s -> System.out.println("Uppercase: " + s.toUpperCase());

        // Use accept() to perform action
        print.accept("hello");          // Value: hello
        printUpper.accept("hello");     // Uppercase: HELLO

        // Chain consumers using andThen()
        print.andThen(printUpper).accept("world");
        // Output:
        // Value: world
        // Uppercase: WORLD
    }
}

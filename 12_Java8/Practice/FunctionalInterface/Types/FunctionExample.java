package Java8.FunctionalInterface.Types;

import java.util.function.Function;

/*
 * 🔹 Function<T, R> --> Transforms input to output
 *
 * Theory:
 *  - Takes one argument of type T, returns a result of type R
 *  - Used for mapping, conversion, calculations
 *
 * Built-in methods:
 *  - apply(T t)          -> Returns result
 *  - andThen(Function after) -> Chains functions (this -> after)
 *  - compose(Function before) -> Chains functions (before -> this)
 */

public class FunctionExample {
    public static void main(String[] args) {

        // Function to square a number
        Function<Integer, Integer> square = n -> n * n;

        // Function to double a number
        Function<Integer, Integer> doubleIt = n -> n * 2;

        // Use apply() to transform
        System.out.println("Square 5: " + square.apply(5));      // 25
        System.out.println("Double 5: " + doubleIt.apply(5));    // 10

        // Chain using andThen: square then double
        System.out.println("Square then double 5: " +
                square.andThen(doubleIt).apply(5)); // 50

        // Chain using compose: double then square
        System.out.println("Double then square 5: " +
                square.compose(doubleIt).apply(5)); // 100
    }
}


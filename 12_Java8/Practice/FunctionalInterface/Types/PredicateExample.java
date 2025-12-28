package Java8.FunctionalInterface.Types;

import java.util.function.Predicate; // Built-in Predicate interface

/*
 * 🔹 Predicate<T> --> Tests a condition
 *
 * Theory:
 *  - Predicate is a functional interface that represents a boolean-valued function.
 *  - It takes one argument and returns true or false.
 *  - Used for conditional checks, filtering, or validation.
 *
 * Built-in methods:
 *  1️⃣ test(T t)           -> Tests the condition
 *  2️⃣ and(Predicate other) -> Combines two predicates using logical AND
 *  3️⃣ or(Predicate other)  -> Combines two predicates using logical OR
 *  4️⃣ negate()             -> Negates the predicate (logical NOT)
 *
 * Example usage:
 *  - Checking if a number is even
 *  - Combining multiple conditions
 */

public class PredicateExample {

    public static void main(String[] args) {

        // Predicate to check if number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Predicate to check if number is greater than 10
        Predicate<Integer> isGreaterThan10 = n -> n > 10;

        // ---------------------------------------------------------
        // Test basic predicate
        // ---------------------------------------------------------
        System.out.println("isEven(8): " + isEven.test(8));           // true
        System.out.println("isGreaterThan10(8): " + isGreaterThan10.test(8)); // false

        // ---------------------------------------------------------
        // Combine predicates using AND
        // ---------------------------------------------------------
        System.out.println("isEven AND isGreaterThan10 (12): " +
                isEven.and(isGreaterThan10).test(12)); // true

        // ---------------------------------------------------------
        // Combine predicates using OR
        // ---------------------------------------------------------
        System.out.println("isEven OR isGreaterThan10 (9): " +
                isEven.or(isGreaterThan10).test(9)); // false

        // ---------------------------------------------------------
        // Negate a predicate
        // ---------------------------------------------------------
        System.out.println("NOT isEven (9): " +
                isEven.negate().test(9)); // true
    }
}

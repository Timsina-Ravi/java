import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // ===== 1. Creating Optional =====

        // Optional with non-null value
        Optional<String> opt1 = Optional.of("Hello");
        System.out.println("Optional with value: " + opt1);

        // Optional that may be null
        Optional<String> opt2 = Optional.ofNullable(null);
        System.out.println("Optional possibly null: " + opt2);

        // Empty Optional
        Optional<String> emptyOpt = Optional.empty();
        System.out.println("Empty Optional: " + emptyOpt);
        System.out.println();

        // ===== 2. isPresent() =====
        if (opt1.isPresent()) { // checks if value is present
            System.out.println("Value is present in opt1: " + opt1.get());
        }
        System.out.println();

        // ===== 3. ifPresent() =====
        // Executes lambda if value is present
        opt1.ifPresent(value -> System.out.println("ifPresent(): " + value));
        opt2.ifPresent(value -> System.out.println("This will not print because value is null"));
        System.out.println();

        // ===== 4. orElse() =====
        // Returns the value if present, else default
        String value1 = opt2.orElse("Default Value");
        System.out.println("Value from orElse(): " + value1);
        System.out.println();

        // ===== 5. orElseGet() =====
        // Similar to orElse(), but uses a Supplier (lazy evaluation)
        String value2 = opt2.orElseGet(() -> "Value from Supplier");
        System.out.println("Value from orElseGet(): " + value2);
        System.out.println();

        // ===== 6. orElseThrow() =====
        // Throws exception if value not present
        try {
            String value3 = opt2.orElseThrow(() -> new RuntimeException("No value present!"));
        } catch (RuntimeException e) {
            System.out.println("orElseThrow(): Caught exception -> " + e.getMessage());
        }
        System.out.println();

        // ===== 7. get() =====
        // Get the value directly (throws exception if empty)
        System.out.println("Value from get(): " + opt1.get());
        System.out.println();

        // ===== 8. filter() =====
        // Returns Optional if value matches predicate, else empty
        Optional<String> filtered = opt1.filter(val -> val.startsWith("H"));
        System.out.println("Filtered Optional (starts with H): " + filtered);
        Optional<String> filtered2 = opt1.filter(val -> val.startsWith("X"));
        System.out.println("Filtered Optional (starts with X): " + filtered2);
        System.out.println();

        // ===== 9. map() =====
        // Transforms value inside Optional
        Optional<Integer> lengthOpt = opt1.map(val -> val.length());
        System.out.println("Length of string inside Optional: " + lengthOpt);
        System.out.println();


    }
}

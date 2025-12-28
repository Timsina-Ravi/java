package Java8.Lambadas.Types;

// 2. Single Parameter Lambadas Expression

// Syntax
//  (a) -> System.out.println("One Parameter" + a);


// Example/Demonstration
@FunctionalInterface
interface ExampleSingleParameter{

    // abstract method
    void oneParameter(int x);
}


public class SingleParameter {
    public static void main(String[] args) {

        // Single Parameter Lambadas Expression

        ExampleSingleParameter ESP = (x) -> System.out.println("Single Parameter Lambada Expression " + x);

        // Calling method
        ESP.oneParameter(1);
    }
}

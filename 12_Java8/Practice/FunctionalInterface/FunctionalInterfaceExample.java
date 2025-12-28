package Java8.FunctionalInterface;

// Functional Interface

// A functional interface in Java is an interface that contains only one abstract method.
// Functional interfaces can have multiple default or static methods, but only one abstract method.


// @FunctionalInterface Annotation
// @FunctionalInterface annotation is used to ensure that the functional interface cannot have more than one abstract method. I



// Example/ Demonstration of Function Interface With annotation

@FunctionalInterface
interface ExampleFunctionalInterface{
    // one abstract method
    void hello();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        // lambada expression is used to deal with functional interface method

        ExampleFunctionalInterface EFI = () -> System.out.println("Hello");
        EFI.hello();


    }
}

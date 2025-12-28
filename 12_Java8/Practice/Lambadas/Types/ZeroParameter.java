package Java8.Lambadas.Types;

//1. Zero Parameter Lambda Expression

// Syntax
//  () ->System.out.println("Zero Parameter Lambda");


// Example/ Demonstration
@FunctionalInterface
interface ExampleZeroParameter{
    // abstract method
    void sayHello();
}



public class ZeroParameter {
    public static void main(String[] args) {

        // Lambda Expression with Zero Parameter
        ExampleZeroParameter zp = () -> System.out.println("Zero Parameter Lambda Expression ");

        // Calling the method
        zp.sayHello();



    }
}

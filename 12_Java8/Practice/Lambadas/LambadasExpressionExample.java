package Java8.Lambadas;

// Lambadas Expression
// Lambda expressions in Java, introduced in Java SE 8.
// It represents the instances of functional interfaces (interfaces with a single abstract method).
// They provide a concise way to express instances of single-method interfaces using a block of code.


// Lambadas expression can only be implemented with functional interface

// Example/Demonstration of Lambadas Expression with Functional Interface
interface FuncInterface {
    // An abstract function
    void abstractFun(int x);

}


public class LambadasExpressionExample {
    public static void main(String[] args) {

        // lambda expression to implement above functional interface.
        FuncInterface obj = (int x)->System.out.println(x);

        // Calling method
        obj.abstractFun(5);
    }
}

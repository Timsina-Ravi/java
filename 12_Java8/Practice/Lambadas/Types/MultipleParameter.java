package Java8.Lambadas.Types;


// 3. Multiple Parameter Lambadas Expression

// Syntax
// (a,b) -> System.out.println("Multiple Parameters " + a + ","+ b);

//Example/Demonstration
@FunctionalInterface
interface ExampleMultipleParameter{

    // abstract method
    void operations(int a, int b);
}


public class MultipleParameter {
    public static void main(String[] args) {



        // Multiple Parameter Lambada Expression

        ExampleMultipleParameter EMP =(a,b) -> System.out.println("Multiple Parameter Lambadas Expression " + a + "," + b);

        //Calling method
        EMP.operations(2,2);
    }
}

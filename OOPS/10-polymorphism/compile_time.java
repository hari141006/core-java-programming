
/*
Compile-Time Polymorphism in Java

    Compile-time polymorphism is achieved through
    method overloading.

    Method overloading means having multiple methods
    with the same name but different parameter lists.

    The compiler determines which method should be called
    based on the number, type, or order of parameters.

    Rules for Method Overloading:

       - Same method name
       - Different number of parameters OR
       - Different type of parameters OR
       - Different order of parameters

    Return type alone cannot be used to overload a method.

    Example:

       add(int, int)
       add(int, int, int)
       add(double, double)

    These methods have the same name but different parameters.
*/

class Calculator {

    // Two integer parameters
    void add(int a, int b) {

        System.out.println("Sum: " + (a + b));
    }

    // Three integer parameters
    void add(int a, int b, int c) {

        System.out.println("Sum: " + (a + b + c));
    }

    // Two double parameters
    void add(double a, double b) {

        System.out.println("Sum: " + (a + b));
    }

    // Different parameter order
    void add(double a, int b) {

        System.out.println("Sum: " + (a + b));
    }
}

public class compile_time {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10, 20);

        calculator.add(10, 20, 30);

        calculator.add(10.5, 20.5);

        calculator.add(10.5, 20);
    }
}
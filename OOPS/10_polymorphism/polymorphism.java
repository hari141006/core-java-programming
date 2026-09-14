
/*
Polymorphism in Java

    Polymorphism means "many forms".

    In Java, polymorphism allows the same method name or
    reference to behave differently depending on the situation.

    The two main types of polymorphism are:

       1. Compile-Time Polymorphism
          - Achieved using method overloading.
          - Method selection happens during compilation.

       2. Runtime Polymorphism
          - Achieved using method overriding.
          - Method selection happens during program execution.

    Example:

       Same method name:
           add()

       But it can work with different parameters.

    Important:
       - "Poly" means many.
       - "Morphism" means forms.
       - Polymorphism improves flexibility and reusability.
*/

class Calculator {

    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {

        return a + b;
    }
}

public class polymorphism {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Integer addition: " +
                calculator.add(10, 20));

        System.out.println("Double addition: " +
                calculator.add(10.5, 20.5));
    }
}
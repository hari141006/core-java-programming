
/*
Instance Methods in Java

    An instance method is a method that belongs to an object.

    Instance methods are declared inside a class without using
    the 'static' keyword.

    They can directly access:
       - Instance variables
       - Other instance methods

    Instance methods are called using an object.

    Syntax:

       objectName.methodName();

    Example:

       Student s1 = new Student();
       s1.display();

    Here, display() is an instance method.
*/

class Calculator {

    int number1;
    int number2;

    // Instance method
    void add() {

        int result = number1 + number2;

        System.out.println("Addition: " + result);
    }

    // Another instance method
    void multiply() {

        int result = number1 * number2;

        System.out.println("Multiplication: " + result);
    }
}

public class instancemethods {

    public static void main(String[] args) {

        // Creating object
        Calculator c1 = new Calculator();

        // Assigning instance variables
        c1.number1 = 10;
        c1.number2 = 5;

        // Calling instance methods
        c1.add();
        c1.multiply();
    }
}
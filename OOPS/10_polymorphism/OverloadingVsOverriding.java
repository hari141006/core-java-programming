
/*
Method Overloading vs Method Overriding

    METHOD OVERLOADING:

       - Same method name
       - Different parameters
       - Usually within the same class
       - Compile-time polymorphism
       - Inheritance is not required

    METHOD OVERRIDING:

       - Same method name
       - Same parameters
       - Parent-child relationship required
       - Runtime polymorphism
       - Child provides a new implementation

    Example of Overloading:

       add(int, int)
       add(int, int, int)

    Example of Overriding:

       Animal.sound()
       Dog.sound()

    Important:
       Return type alone cannot differentiate overloaded methods.
*/

class Calculator {

    // Method Overloading
    void add(int a, int b) {

        System.out.println("Two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {

        System.out.println("Three numbers: " + (a + b + c));
    }
}

class Animal {

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

public class OverloadingVsOverriding {

    public static void main(String[] args) {

        // Overloading
        Calculator calculator = new Calculator();

        calculator.add(10, 20);
        calculator.add(10, 20, 30);

        System.out.println();

        // Overriding
        Animal animal = new Dog();

        animal.sound();
    }
}
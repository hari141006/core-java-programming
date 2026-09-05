/*
Abstract Class in Java

    An abstract class is a class declared using the
    'abstract' keyword.

    An abstract class cannot be instantiated directly.

    It can contain:
       - Abstract methods
       - Concrete methods
       - Variables
       - Constructors
       - Static methods

    An abstract class is generally used when multiple child
    classes share some common properties or behavior.

    Example:

        Animal
          ↓
        Dog

    Animal provides common behavior.
    Dog provides the specific implementation.

    Syntax:

        abstract class ClassName {
            // members
        }
*/

abstract class Animal {

    // Concrete method
    void eat() {

        System.out.println("Animal is eating");
    }

    // Abstract method
    abstract void sound();
}

class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

public class abstractclass {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Animal animal = new Animal();

        // Creating child class object
        Dog dog = new Dog();

        dog.eat();
        dog.sound();
    }
}
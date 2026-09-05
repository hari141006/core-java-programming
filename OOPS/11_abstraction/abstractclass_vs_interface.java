
/*
Abstract Class vs Interface in Java

    Both abstract classes and interfaces are used to achieve
    abstraction, but they are used in different situations.

    ABSTRACT CLASS:

       - Declared using 'abstract class'.
       - Can contain abstract and concrete methods.
       - Can have instance variables.
       - Can have constructors.
       - A class can extend only one class.

    INTERFACE:

       - Declared using 'interface'.
       - Defines a contract for implementing classes.
       - A class can implement multiple interfaces.
       - Interface fields are public, static and final by default.
       - A class uses 'implements' to implement an interface.

    Example:

       Abstract Class:
           Animal
             ↓
            Dog

       Interface:
           Printable
             ↓
            Dog

    Use an abstract class when classes share common state
    or implementation.

    Use an interface when you want to define a common
    capability or contract.
*/

abstract class Animal {

    String name;

    Animal(String name) {

        this.name = name;
    }

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {

        System.out.println(name + " is eating");
    }
}

interface Pet {

    void play();
}

class Dog extends Animal implements Pet {

    Dog(String name) {

        super(name);
    }

    @Override
    void sound() {

        System.out.println(name + " barks");
    }

    @Override
    public void play() {

        System.out.println(name + " is playing");
    }
}

public class abstractclass_vs_interface {

    public static void main(String[] args) {

        Dog dog = new Dog("Bruno");

        // From abstract class
        dog.eat();
        dog.sound();

        // From interface
        dog.play();
    }
}
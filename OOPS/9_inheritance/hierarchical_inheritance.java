
/*
Hierarchical Inheritance in Java

    Hierarchical inheritance occurs when multiple child classes
    inherit from the same parent class.

    Structure:

             Parent
             /    \
            ↓      ↓
         Child1  Child2

    Example:

             Animal
             /    \
            ↓      ↓
           Dog    Cat

    Here:
       - Dog inherits from Animal
       - Cat inherits from Animal

    Important points:
       - One parent class
       - Multiple child classes
       - Common functionality can be placed in the parent class
       - Child classes can have their own specific methods
*/

class Animal {

    void eat() {

        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {

        System.out.println("Cat is meowing");
    }
}

public class hierarchical_inheritance {

    public static void main(String[] args) {

        // Creating Dog object
        Dog dog = new Dog();

        dog.eat();   // Inherited method
        dog.bark();  // Dog's own method

        System.out.println();

        // Creating Cat object
        Cat cat = new Cat();

        cat.eat();   // Inherited method
        cat.meow();  // Cat's own method
    }
}
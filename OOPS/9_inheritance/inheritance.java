
/*
Single Inheritance in Java

    Single inheritance is a type of inheritance where one child
    class inherits the properties and methods of one parent class.

    It is achieved using the 'extends' keyword.

    Syntax:

        class Child extends Parent {
            // child class members
        }

    Here:
        Parent → Superclass / Parent class
        Child  → Subclass / Child class

    Important points:
       - One parent class
       - One child class
       - Promotes code reusability
       - Child class can access accessible members of parent class

    Example:

        Animal
           ↓
          Dog

    Dog IS-A Animal.
*/

class Animal {

    String name = "Animal";

    void eat() {

        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog is barking");
    }
}

public class inheritance {

    public static void main(String[] args) {

        // Creating object of child class
        Dog dog = new Dog();

        // Accessing inherited variable
        System.out.println("Name: " + dog.name);

        // Accessing inherited method
        dog.eat();

        // Accessing child class method
        dog.bark();
    }
}
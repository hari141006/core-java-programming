
/*
Runtime Polymorphism in Java

    Runtime polymorphism is achieved through method overriding.

    Method overriding occurs when a child class provides its
    own implementation of a method that is already defined
    in the parent class.

    The method that executes is determined at runtime based
    on the actual object.

    Rules of Method Overriding:

       - Same method name
       - Same parameter list
       - Compatible return type
       - Must have inheritance relationship
       - Child provides its own implementation

    The @Override annotation is recommended because it helps
    the compiler verify that the method is actually overridden.

    Example:

       Animal
          ↓
         Dog

       Animal → sound()
       Dog    → sound()

    When a Dog object is used, Dog's sound() executes.
*/

class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

public class runtime_polymorphism {

    public static void main(String[] args) {

        // Parent reference pointing to child object
        Animal animal = new Dog();

        // Dog's overridden method executes
        animal.sound();
    }
}
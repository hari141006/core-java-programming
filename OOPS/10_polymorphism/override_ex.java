
/*
@Override Annotation in Java

    The @Override annotation is used when a child class
    overrides a method of its parent class.

    Method overriding occurs when:

       - Parent and child have the same method name
       - Same parameters
       - Child class provides its own implementation
       - There must be an inheritance relationship

    The @Override annotation tells the compiler that the
    child method is intended to override the parent method.

    Advantages of @Override:

       - Helps identify mistakes
       - Improves code readability
       - Compiler checks whether overriding is valid
       - Prevents accidental method overloading

    Example:

        Animal
           ↓
          Dog

        Animal → sound()
        Dog    → sound()

    Dog's sound() overrides Animal's sound().
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

public class override_ex {

    public static void main(String[] args) {

        // Parent reference pointing to child object
        Animal animal = new Dog();

        // Calls the overridden method
        animal.sound();
    }
}
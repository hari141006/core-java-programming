
/*
Dynamic Method Dispatch in Java

    Dynamic Method Dispatch is the mechanism by which Java
    determines at runtime which overridden method should be
    executed.

    It is an important part of runtime polymorphism.

    A parent class reference can refer to an object of
    a child class.

    Example:

        Animal animal = new Dog();

    Here:
        Animal → Reference type
        Dog    → Actual object type

    When animal.sound() is called, Java executes the Dog's
    overridden sound() method.

    The decision is made during runtime.

    Important:
       - Requires inheritance
       - Uses method overriding
       - Parent reference can refer to child object
       - Method selection happens at runtime
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

class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        // Parent reference → Dog object
        Animal animal;

        animal = new Dog();
        animal.sound();

        // Parent reference → Cat object
        animal = new Cat();
        animal.sound();
    }
}
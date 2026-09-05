
/*
Abstract Method in Java

    An abstract method is a method that is declared without
    providing its implementation.

    It uses the 'abstract' keyword.

    Syntax:

        abstract returnType methodName();

    An abstract method provides a rule that child classes
    must follow.

    The child class must override and implement the
    abstract method.

    Important points:

       - Abstract method has no body.
       - It must be declared inside an abstract class
         or interface.
       - A concrete child class must implement it.
       - It is useful when different child classes need
         different implementations of the same behavior.

    Example:

        Animal
        sound()
           ↓
        Dog → Dog barks
        Cat → Cat meows
*/

abstract class Animal {

    // Abstract method
    abstract void sound();
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

public class abstractmethod {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
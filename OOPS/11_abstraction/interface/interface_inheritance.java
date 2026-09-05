/*
Interface Inheritance in Java

    An interface can inherit another interface using
    the extends keyword.

    Important points:
       - An interface can extend another interface.
       - An interface can extend multiple interfaces.
       - The child interface inherits the methods of the parent interface.
       - A class implementing the child interface must implement
        the required abstract methods from both interfaces.
       - Interface inheritance supports multiple inheritance
        through interfaces.
*/

interface Animal {

    void eat();

}

interface Pet extends Animal {

    void play();

}

class Dog implements Pet {

    @Override
    public void eat() {

        System.out.println("Dog eats food");

    }

    @Override
    public void play() {

        System.out.println("Dog plays with a ball");

    }

}

public class interface_inheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.play();

    }
}
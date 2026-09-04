
/*
Upcasting and Downcasting in Java

    Upcasting:
       Converting a child class reference into a parent class
       reference.

       It is safe and usually happens automatically.

       Example:

           Animal animal = new Dog();

       Dog object is referred to using an Animal reference.

    Downcasting:
       Converting a parent class reference back into a child
       class reference.

       It must be done explicitly.

       Example:

           Dog dog = (Dog) animal;

    Important:
       - Upcasting is generally safe.
       - Downcasting requires explicit casting.
       - Downcasting should be performed only when the object
         actually belongs to the child type.
       - Incorrect downcasting can cause ClassCastException.
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

public class UpDownCasting {

    public static void main(String[] args) {

        // UPCASTING
        Animal animal = new Dog();

        animal.eat();

        // DOWNCASTING
        Dog dog = (Dog) animal;

        dog.eat();
        dog.bark();
    }
}
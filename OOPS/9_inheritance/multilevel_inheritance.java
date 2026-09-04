
/*
Multilevel Inheritance in Java

    Multilevel inheritance occurs when a class inherits from
    another derived class, forming a chain of inheritance.

    In this type of inheritance:

        Class A
           ↓
        Class B
           ↓
        Class C

    Class B inherits from Class A.
    Class C inherits from Class B.

    Therefore, Class C can access the accessible members
    inherited from both Class A and Class B.

    Example:

        Animal
           ↓
          Dog
           ↓
         Puppy

    Here:
       Animal → Grandparent class
       Dog    → Parent class
       Puppy  → Child class

    Important:
       - Forms an inheritance chain
       - Promotes code reusability
       - Uses the 'extends' keyword
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

class Puppy extends Dog {

    void play() {

        System.out.println("Puppy is playing");
    }
}

public class multilevel_inheritance {

    public static void main(String[] args) {

        // Creating object of the last class
        Puppy puppy = new Puppy();

        // Method inherited from Animal
        puppy.eat();

        // Method inherited from Dog
        puppy.bark();

        // Method of Puppy
        puppy.play();
    }
}
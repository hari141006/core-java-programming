
/*
Hybrid Inheritance in Java

    Hybrid inheritance is a combination of two or more
    types of inheritance.

    For example, a combination of:
       - Hierarchical inheritance
       - Multiple inheritance
       - Multilevel inheritance

    Example structure:

             Animal
             /    \
            ↓      ↓
           Dog    Cat
            ↓
          Puppy

    This combines different inheritance structures.

    Java does NOT support hybrid inheritance directly using
    classes because multiple inheritance with classes is not
    supported.

    However, hybrid inheritance can be achieved using
    a combination of classes and interfaces.

    Important:
       - Hybrid inheritance = combination of inheritance types
       - Not directly supported using classes
       - Interfaces can be used to achieve similar designs
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

interface Pet {

    void play();
}

// Dog inherits from Animal through class inheritance.
// Puppy extends Dog and implements Pet.
class Puppy extends Dog implements Pet {

    public void play() {

        System.out.println("Puppy is playing");
    }
}

public class hybrid_inheritance {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        // Method inherited from Animal
        puppy.eat();

        // Method inherited from Dog
        puppy.bark();

        // Method implemented from interface
        puppy.play();
    }
}
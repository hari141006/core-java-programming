
/*
super Keyword in Java

    The "super" keyword is used to refer to the immediate
    parent class.

    It is mainly used when a child class needs to access
    variables, methods, or constructors of its parent class.

    Important points:
       - super.variable accesses a parent class variable.
       - super.method() calls a parent class method.
       - super() calls a parent class constructor.
       - super refers to the immediate parent class.
       - It is commonly used when parent and child classes
        have members with the same name.
*/

class Animal {

    String name = "Animal";

    void sound() {

        System.out.println("Animal makes a sound");

    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println("Child Class Name: " + name);
        System.out.println("Parent Class Name: " + super.name);

        super.sound();

    }
}

public class superkeyword {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.display();

    }
}
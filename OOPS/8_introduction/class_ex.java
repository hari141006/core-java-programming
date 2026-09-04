
/*
Class in Java

    A class is a blueprint or template used to create objects.

    A class can contain:
       - Variables
       - Methods
       - Constructors
       - Blocks
       - Nested classes

    Syntax:

       class ClassName {
           // variables
           // methods
       }

    The class itself does not represent a specific object.
    Objects are created from the class.

    Example:
       Car is a class.
       BMW, Audi, or Toyota can be objects created from a Car class.
*/

class Car {

    // Instance variable
    String brand;
    int speed;

    // Method
    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class class_ex {

    public static void main(String[] args) {

        System.out.println("Car class contains:");
        System.out.println("- Brand");
        System.out.println("- Speed");
        System.out.println("- display() method");
    }
}
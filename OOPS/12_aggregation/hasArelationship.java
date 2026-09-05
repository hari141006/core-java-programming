
/*
HAS-A Relationship in Java

    A HAS-A relationship represents a relationship between two classes
    where one class contains a reference to an object of another class.

    Aggregation is one way of representing a HAS-A relationship.

    Example:
        A Car HAS-A Engine.

    Important points:
       - HAS-A represents a relationship between objects.
       - One class contains an object/reference of another class.
       - It is different from inheritance.
       - Inheritance represents an IS-A relationship.
       - Aggregation represents a HAS-A relationship.
*/

class Engine {

    void start() {

        System.out.println("Engine starts");

    }
}

class Car {

    Engine engine;

    Car() {

        engine = new Engine();

    }

    void startCar() {

        engine.start();
        System.out.println("Car starts");

    }
}

public class hasArelationship {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();

    }
}
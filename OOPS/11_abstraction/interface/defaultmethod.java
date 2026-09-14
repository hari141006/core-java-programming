
/*
Default Method in Interface

    A default method is a method inside an interface
    that contains a method body.

    Default methods were introduced in Java 8.

    Important points:
       - A default method uses the default keyword.
       - A default method contains a body.
       - The implementing class does not have to override it.
       - The implementing class can override the default method
        if it needs different behavior.
       - Default methods allow new functionality to be added
        to interfaces without forcing every implementing class
        to immediately implement the method.
*/

interface Vehicle {

    void start();

    default void fuelType() {

        System.out.println("Vehicle uses fuel");

    }

}

class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car starts");

    }

}

public class defaultmethod {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.fuelType();

    }
}
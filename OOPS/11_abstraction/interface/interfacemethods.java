
/*
Interface Methods in Java

    Interface methods define the behavior that implementing
    classes must provide.

    Important points:
       - Abstract methods in an interface do not have a body.
       - Abstract interface methods are public and abstract by default.
       - The implementing class must provide the method body.
       - The implementation method must be public.
       - The @Override annotation can be used to indicate
        that the interface method is implemented.
*/

interface Vehicle {

    void start();

    void stop();

}

class Car implements Vehicle {

    @Override
    public void start() {

        System.out.println("Car starts");

    }

    @Override
    public void stop() {

        System.out.println("Car stops");

    }

}

public class interfacemethods {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.stop();

    }
}
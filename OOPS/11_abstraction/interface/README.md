
## Why Are Interfaces Used?

Interfaces are used in Java to achieve abstraction and define a common
contract that different classes can follow.

An interface tells a class **what it must do**, while the implementing
class decides **how it should do it**.

## Why Use an Interface Instead of an Abstract Class?

Interfaces are preferred when:

- Multiple unrelated classes need to follow the same contract.

- A class needs to implement multiple interfaces.

- We want to achieve multiple inheritance of behavior/contracts.

- We want to provide loose coupling between classes.

- We want to define common functionality without forcing classes
  to share a common parent class.

## Example

Consider different types of vehicles:

```java
interface Vehicle {

    void start();

}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts");
    }
}
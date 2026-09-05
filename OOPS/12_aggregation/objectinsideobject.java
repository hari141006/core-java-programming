
/*
Object Inside Object in Java

    In aggregation, an object of one class can be used as a
    member of another class.

    This is commonly described as one object containing a
    reference to another object.

    Example:
        A Computer HAS-A Processor.

    Important points:
       - A class can contain an object reference as a variable.
       - The referenced object can be accessed through the
        containing object.
       - This creates a HAS-A relationship.
       - The contained object can exist independently.
*/

class Processor {

    String brand;

    Processor(String brand) {

        this.brand = brand;

    }

    void displayProcessor() {

        System.out.println("Processor: " + brand);

    }
}

class Computer {

    String model;
    Processor processor;

    Computer(String model, Processor processor) {

        this.model = model;
        this.processor = processor;

    }

    void displayComputer() {

        System.out.println("Computer Model: " + model);
        processor.displayProcessor();

    }
}

public class objectinsideobject {

    public static void main(String[] args) {

        Processor processor = new Processor("Intel");

        Computer computer = new Computer("Dell", processor);

        computer.displayComputer();

    }
}
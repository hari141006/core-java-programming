
/*
Static Method in Interface

    A static method in an interface belongs to the interface
    itself rather than to objects of implementing classes.

    Important points:
       - A static interface method uses the static keyword.
       - It contains a method body.
       - It is called using the interface name.
       - It cannot be called using an object of the implementing class.
       - Static interface methods are useful for utility operations.
*/

interface Calculator {

    static void showMessage() {

        System.out.println("This is a static method in an interface");

    }

}

public class staticmethod {

    public static void main(String[] args) {

        Calculator.showMessage();

    }
}
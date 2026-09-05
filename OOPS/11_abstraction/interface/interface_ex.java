
/*
Interface in Java

    An interface is a blueprint or contract that defines
    behavior that implementing classes must provide.

    An interface is declared using the 'interface' keyword.

    A class implements an interface using the 'implements'
    keyword.

    Syntax:

        interface InterfaceName {

            void methodName();
        }

        class ClassName implements InterfaceName {

            @Override
            public void methodName() {
                // implementation
            }
        }

    Important points:

       - Interface cannot be instantiated directly.
       - A class uses 'implements' to implement an interface.
       - Interface methods that are abstract must be implemented
         by the implementing class.
       - A class can implement multiple interfaces.
       - Interface fields are public, static and final by default.

    Interface represents a contract:

        "What should be done"

    The implementing class defines:

        "How it should be done"
*/

interface Animal {

    // Abstract method
    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {

        System.out.println("Dog barks");
    }
}

public class interface_ex {

    public static void main(String[] args) {

        // Creating object of implementing class
        Dog dog = new Dog();

        dog.sound();
    }
}
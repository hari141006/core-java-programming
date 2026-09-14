
/*
Multiple Interfaces in Java

    Java does not support multiple inheritance using classes.

    However, a class can implement multiple interfaces.

    This allows a class to inherit behavior contracts from
    more than one interface.

    Syntax:

        class Child implements Interface1, Interface2 {
            // implementation
        }

    Example:

        Interface1     Interface2
             \             /
              \           /
                   Child

    Important points:

       - A class can implement multiple interfaces.
       - Interfaces are separated using commas.
       - The class must implement all required abstract methods.
       - This is one way Java supports multiple inheritance
         of type.
*/

interface Father {

    void work();
}

interface Mother {

    void care();
}

class Child implements Father, Mother {

    @Override
    public void work() {

        System.out.println("Child is working");
    }

    @Override
    public void care() {

        System.out.println("Child is caring");
    }
}

public class multipleInterfaces {

    public static void main(String[] args) {

        Child child = new Child();

        child.work();
        child.care();
    }
}
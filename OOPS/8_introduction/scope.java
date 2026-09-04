
/*
Scope in Java

    Scope defines where a variable can be accessed in a program.

    Important types of variable scope:

       1. Local Variable
          - Declared inside a method, constructor, or block.
          - Accessible only within that method or block.

       2. Instance Variable
          - Declared inside a class but outside methods.
          - Belongs to an object.
          - Can be accessed by instance methods.

       3. Static/Class Variable
          - Declared using the static keyword.
          - Belongs to the class rather than individual objects.

    Important:
       Java does not have true global variables like some languages.
       Instance and static variables are class members.
*/

class ScopeExample {

    // Instance variable
    int instanceNumber = 10;

    // Static/class variable
    static int staticNumber = 20;

    void display() {

        // Local variable
        int localNumber = 30;

        System.out.println("Instance variable: " + instanceNumber);
        System.out.println("Static variable: " + staticNumber);
        System.out.println("Local variable: " + localNumber);
    }
}

public class scope {

    public static void main(String[] args) {

        ScopeExample obj = new ScopeExample();

        obj.display();

        // Instance variable accessed using object
        System.out.println("Instance: " + obj.instanceNumber);

        // Static variable accessed using class
        System.out.println("Static: " + ScopeExample.staticNumber);

        // localNumber cannot be accessed here
        // System.out.println(localNumber);
    }
}


/*
static Keyword in Java

    The 'static' keyword is used for members that belong to
    the class rather than individual objects.

    Static can be used with:
       - Variables
       - Methods
       - Blocks
       - Nested classes

    Static variable:
       - Only one shared copy exists for the class.
       - All objects share the same static variable.

    Static method:
       - Belongs to the class.
       - Can be called without creating an object.
       - Called using ClassName.methodName().

    Syntax:

       class ClassName {

           static int variable;

           static void method() {
               // code
           }
       }

    Calling:

       ClassName.variable;
       ClassName.method();
*/

class Student {

    // Instance variable
    String name;

    // Static variable
    static String college = "SREC";

    // Instance method
    void display() {

        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    // Static method
    static void collegeDetails() {

        System.out.println("College: " + college);
    }
}

public class static_ex{

    public static void main(String[] args) {

        // Creating first object
        Student s1 = new Student();
        s1.name = "Hari";

        // Creating second object
        Student s2 = new Student();
        s2.name = "Arun";

        // Both objects share the same static variable
        s1.display();

        System.out.println();

        s2.display();

        System.out.println();

        // Calling static method without object
        Student.collegeDetails();
    }
}
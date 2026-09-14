
/*
Access Modifiers in Java

    Access modifiers control the visibility and accessibility
    of classes, variables, methods, and constructors.

    Java has four main access levels:

       1. public
          - Accessible from anywhere.

       2. private
          - Accessible only inside the same class.

       3. protected
          - Accessible within the same package and through
            inheritance in other packages.

       4. default
          - No keyword is used.
          - Accessible within the same package.

    Access level:

       public     → Everywhere
       protected  → Same package + subclasses
       default    → Same package
       private    → Same class
*/

class Student {

    // Public variable
    public String name = "Hari";

    // Private variable
    private int age = 20;

    // Protected variable
    protected String department = "EIE";

    // Default/package-private variable
    String college = "SREC";

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("College: " + college);
    }
}

public class accessmodifier {

    public static void main(String[] args) {

        Student s1 = new Student();

        // Public → accessible
        System.out.println(s1.name);

        // Protected → accessible in same package
        System.out.println(s1.department);

        // Default → accessible in same package
        System.out.println(s1.college);

        // Private → cannot be accessed directly here
        // System.out.println(s1.age);

        s1.display();
    }
}
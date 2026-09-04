
/*
Instance Variables in Java

    Instance variables are variables declared inside a class
    but outside any method, constructor, or block.

    Each object gets its own separate copy of instance variables.

    They represent the state or properties of an object.

    Example:
       A Student object can have:
          - name
          - age
          - department

    Important points:
       - Declared inside class
       - Outside methods
       - Belong to objects
       - Each object has its own copy
       - Automatically get default values if not initialized

    Default values:
       int     → 0
       double  → 0.0
       boolean → false
       String  → null
*/

class Student {

    // Instance variables
    String name;
    int age;
    String department;

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}

public class instancevariables {

    public static void main(String[] args) {

        // First object
        Student s1 = new Student();

        s1.name = "Hari";
        s1.age = 20;
        s1.department = "EIE";

        // Second object
        Student s2 = new Student();

        s2.name = "Arun";
        s2.age = 21;
        s2.department = "CSE";

        s1.display();

        System.out.println();

        s2.display();
    }
}
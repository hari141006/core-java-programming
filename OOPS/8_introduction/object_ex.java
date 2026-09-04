
/*
Object in Java

    An object is an instance of a class.

    An object represents a real-world entity and contains:
       - State  → Data/variables
       - Behavior → Methods

    Objects are normally created using the 'new' keyword.

    Syntax:

       ClassName objectName = new ClassName();

    Example:

       Student s1 = new Student();

       Here:
          Student  → Class
          s1       → Object reference
          new      → Creates a new object
*/

class Student {

    String name;
    int age;

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class object_ex {

    public static void main(String[] args) {

        // Creating an object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Hari";
        s1.age = 20;

        // Calling method using object
        s1.display();
    }
}
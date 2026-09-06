
/*
Constructor in Java

    A constructor is a special member of a class that is used
    to initialize an object.

    A constructor is automatically called when an object is
    created using the new keyword.

    Important points:
       - The constructor name must be the same as the class name.
       - A constructor does not have a return type.
       - A constructor is automatically called when an object is created.
       - Constructors are mainly used to initialize objects.
*/

class Student {

    Student() {

        System.out.println("Constructor is called");

    }
}

public class constructor {

    public static void main(String[] args) {
        Student student = new Student();

    }
}
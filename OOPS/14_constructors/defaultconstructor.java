
/*
Default Constructor in Java

    A default constructor is a constructor that does not
    accept any parameters.

    It is used to initialize an object with default values
    or perform some initial operations.

    Important points:
       - It does not have parameters.
       - Its name must be the same as the class name.
       - It does not have a return type.
       - It is automatically called when an object is created.
       - If no constructor is written, Java provides a
        compiler-generated default constructor.
*/

class Student {

    String name;
    int age;

    Student() {

        name = "Hari";
        age = 20;

    }

    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class defaultconstructor {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

    }
}

/*
Parameterized Constructor in Java

    A parameterized constructor is a constructor that accepts
    one or more parameters.

    It is used to initialize an object with values supplied
    when the object is created.

    Important points:
       - It accepts parameters.
       - It initializes object data using the given values.
       - Different objects can be initialized with different values.
       - The constructor name must be the same as the class name.
       - A constructor does not have a return type.
*/

class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class parameterizedconstructor {

    public static void main(String[] args) {

        Student student1 = new Student("Hari", 20);
        Student student2 = new Student("Siva", 21);

        student1.display();

        System.out.println();

        student2.display();

    }
}
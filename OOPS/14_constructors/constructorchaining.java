
/*
Constructor Chaining in Java

    Constructor chaining is the process of calling one
    constructor from another constructor.

    Java provides two important ways to perform constructor chaining:

       - this()  -> Calls another constructor in the same class.
       - super() -> Calls the constructor of the parent class.

    Important points:
       - this() must be the first statement in a constructor.
       - super() must also be the first statement in a constructor.
       - this() and super() cannot be used together as the
        first statement of the same constructor.
       - Constructor chaining reduces duplicate initialization code.
*/

class Student {

    String name;
    int age;

    Student() {

        this("Hari", 20);

        System.out.println("No-argument constructor");

    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Parameterized constructor");

    }

    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class constructorchaining {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

    }
}
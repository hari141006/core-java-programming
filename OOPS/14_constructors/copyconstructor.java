
/*
Copy Constructor in Java

    A copy constructor is a constructor that creates a new
    object by copying the values from another existing object.

    Java does not provide a special copy constructor keyword.
    The programmer creates a copy constructor manually.

    Important points:
       - It accepts an object of the same class as a parameter.
       - It copies the values from the existing object.
       - It creates a separate object.
       - Changes made to the new object's primitive fields
        do not change the original object's primitive fields.
*/

class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    Student(Student student) {

        this.name = student.name;
        this.age = student.age;

    }

    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class copyconstructor {

    public static void main(String[] args) {

        Student student1 = new Student("Hari", 20);

        Student student2 = new Student(student1);

        System.out.println("Original Object:");

        student1.display();

        System.out.println();

        System.out.println("Copied Object:");

        student2.display();

    }
}
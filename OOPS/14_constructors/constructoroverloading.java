
/*
Constructor Overloading in Java

    Constructor overloading means defining multiple constructors
    in the same class with different parameter lists.

    Each constructor can initialize the object in a different way.

    Important points:
       - Multiple constructors can exist in one class.
       - Constructors must have different parameter lists.
       - Constructors cannot be overloaded only by changing
        the return type because constructors have no return type.
       - Constructor overloading provides multiple ways to
        create and initialize objects.
*/

class Student {

    String name;
    int age;

    Student() {

        name = "Unknown";
        age = 0;

    }

    Student(String name) {

        this.name = name;
        age = 0;

    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

public class constructoroverloading {

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Hari");

        Student student3 = new Student("Siva", 21);

        student1.display();

        System.out.println();

        student2.display();

        System.out.println();

        student3.display();

    }
}
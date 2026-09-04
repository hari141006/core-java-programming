
/*
OOP (Object-Oriented Programming) Introduction

    OOP stands for Object-Oriented Programming.
    It is a programming approach based on classes and objects.

    Java is mainly an object-oriented programming language.

    The four major principles of OOP are:
       1. Encapsulation
       2. Inheritance
       3. Polymorphism
       4. Abstraction

    Important OOP terms:
       - Class  : Blueprint or template for creating objects.
       - Object  : Instance of a class.
       - Variable: Stores the state/data of an object.
       - Method  : Defines the behavior/action of an object.

    Example:
       A Student class can contain:
       - name
       - age
       - displayDetails()

       A particular student created from the Student class is an object.
*/

class Student {

    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class introduction {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Hari";
        student.age = 20;

        student.displayDetails();
    }
}
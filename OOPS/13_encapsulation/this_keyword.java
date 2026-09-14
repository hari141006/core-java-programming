
/*
this Keyword in Java

    The "this" keyword refers to the current object.

    It is commonly used when an instance variable and a
    method or constructor parameter have the same name.

    Important points:
       - "this" refers to the current object.
       - It is used to distinguish instance variables from parameters.
       - It can be used to call another constructor.
       - It can be used to call the current class method.
       - It is commonly used in constructors and setters.

    Example:

        this.name = name;

        this.name  -> Instance variable
        name       -> Parameter
*/

class Student {

    private String name;
    private int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);

    }
}

public class this_keyword {

    public static void main(String[] args) {

        Student student = new Student("Hari", 20);

        student.display();

    }
}
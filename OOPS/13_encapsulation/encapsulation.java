/*
Encapsulation in Java

    Encapsulation is the process of wrapping data (variables)
    and methods together inside a single class.

    It also protects the data by restricting direct access
    from outside the class.

    Important points:
       - Variables are usually declared as private.
       - Private variables cannot be accessed directly from outside.
       - Public methods are used to access and modify the data.
       - Getters are used to read data.
       - Setters are used to modify data.
       - Encapsulation provides data security and controlled access.
*/

class Student {

    private String name;
    private int age;

    public void setDetails(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void displayDetails() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class encapsulation {

    public static void main(String[] args) {

        Student student = new Student();

        student.setDetails("Hari", 20);

        student.displayDetails();

    }
}
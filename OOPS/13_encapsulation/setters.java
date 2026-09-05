
/*
Setter Method in Java

    A setter is a method used to modify or update the value
    of a private variable.

    Since private variables cannot be directly modified from
    outside the class, a public setter method provides
    controlled access.

    Important points:
       - A setter normally starts with the word "set".
       - It is usually declared as public.
       - It is used to modify private data.
       - Setters can be used to validate data before assigning it.
*/

class Student {

    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        if (age > 0) {

            this.age = age;

        } else {

            System.out.println("Invalid age");

        }
    }

    public void display() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

    }
}

public class setters {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Hari");
        student.setAge(20);

        student.display();

    }
}
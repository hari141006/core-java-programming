
/*
Getter Method in Java

    A getter is a method used to read or retrieve the value
    of a private variable.

    Since private variables cannot be accessed directly from
    outside the class, a public getter method is used.

    Important points:
       - A getter normally starts with the word "get".
       - It returns the value of a private variable.
       - It does not directly modify the variable.
       - Getters provide controlled access to private data.
*/

class Student {

    private String name;
    private int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }
}

public class getters {

    public static void main(String[] args) {

        Student student = new Student("Hari", 20);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

    }
}
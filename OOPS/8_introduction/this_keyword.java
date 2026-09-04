
/*
this Keyword in Java

    The 'this' keyword refers to the current object.

    It is commonly used when instance variable names and
    parameter names are the same.

    Example:

       class Student {

           String name;

           Student(String name) {
               this.name = name;
           }
       }

    Here:

       this.name
           → Instance variable

       name
           → Constructor parameter

    Common uses of 'this':
       1. Refers to current object
       2. Resolves variable name conflicts
       3. Calls current class method
       4. Calls another constructor using this()
*/

class Student {

    String name;
    int age;

    Student(String name, int age) {

        // 'this' refers to the current object's variables
        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class this_keyword {

    public static void main(String[] args) {

        Student s1 = new Student("Hari", 20);

        s1.display();
    }
}
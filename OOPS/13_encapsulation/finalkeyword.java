
/*
final Keyword in Java

    The "final" keyword is used to restrict modification.

    The final keyword can be used with variables, methods,
    and classes.

    Final Variable:
       - A final variable cannot be reassigned after initialization.

    Final Method:
       - A final method cannot be overridden by a child class.

    Final Class:
       - A final class cannot be inherited.

    Important points:
       - final variable -> Cannot be changed.
       - final method -> Cannot be overridden.
       - final class  -> Cannot be inherited.
*/

class Student {

    final int MAX_MARK = 100;

    final void display() {

        System.out.println("Maximum Mark: " + MAX_MARK);

    }
}

final class College {

    void show() {

        System.out.println("This is a final class");

    }
}

public class finalkeyword {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

        College college = new College();

        college.show();

    }
}
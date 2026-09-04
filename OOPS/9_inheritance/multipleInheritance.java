
/*
Multiple Inheritance in Java

    Multiple inheritance means that one child class inherits
    from two or more parent classes.

    Structure:

        Parent1       Parent2
           \           /
            \         /
             ↓       ↓
               Child

    Example:

        class A
        class B
        class C extends A, B

    Java does NOT support multiple inheritance using classes.

    The reason is ambiguity.

    Example:

        Class A has method display()
        Class B also has method display()

        Class C inherits both A and B.

    If C calls display(), Java would have difficulty deciding
    which display() method should be executed.

    This is commonly called the Diamond Problem.

    Instead, Java supports multiple inheritance through interfaces.

    Example:

        interface A
        interface B

        class C implements A, B
*/

interface Father {

    void fatherMethod();
}

interface Mother {

    void motherMethod();
}

// A class can implement multiple interfaces
class Child implements Father, Mother {

    public void fatherMethod() {

        System.out.println("Father method");
    }

    public void motherMethod() {

        System.out.println("Mother method");
    }

    void childMethod() {

        System.out.println("Child method");
    }
}

public class multipleInheritance {

    public static void main(String[] args) {

        Child child = new Child();

        child.fatherMethod();
        child.motherMethod();
        child.childMethod();
    }
}
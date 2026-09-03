
// Definition:
// A non-static method belongs to an object of the class.
// We need to create an object before calling a non-static method.

public class nonstaticmethod {

    void greet() {
        System.out.println("Hello from non-static method");
    }

    void display() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {

        nonstaticmethod obj = new nonstaticmethod();

        obj.greet();
        obj.display();
    }
}
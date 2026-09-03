
// Definition:
// A static method belongs to the class rather than to an object.
// It can be called directly without creating an object.

public class staticmethod {

    static void greet() {
        System.out.println("Hello from static method");
    }

    static void display() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {

        greet();
        display();
    }
}
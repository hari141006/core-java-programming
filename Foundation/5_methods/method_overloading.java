 
 // Definition:
// Method overloading means having multiple methods with the same name.
// The methods must have different numbers or types of parameters.

public class method_overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Two integers: " + add(10, 20));

        System.out.println("Three integers: " + add(10, 20, 30));

        System.out.println("Two doubles: " + add(10.5, 20.5));
    }
}
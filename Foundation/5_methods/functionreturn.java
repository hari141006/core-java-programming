

// Definition:
// A return value is the result sent back by a method to the calling statement.
// The return keyword is used to send a value back from the method.

public class functionreturn {

    static int multiply(int a, int b) {

        return a * b;
    }

    public static void main(String[] args) {

        int result = multiply(5, 4);

        System.out.println("Multiplication: " + result);
    }
}

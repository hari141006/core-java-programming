
// Definition:
// Arguments are the actual values passed to a method when it is called.
// Parameters are the variables that receive those values inside the method.

public class arguments {

    static void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {

        add(10, 20);
        add(30, 40);
    }
}

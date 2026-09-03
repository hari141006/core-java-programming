
// Definition:
// Passing values to a method means sending data from the calling method to another method.
// The values are received by the method through parameters.

public class passingvalues {

    static void student(String name, int age) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {

        student("Hari", 20);

        add(10, 20);
    }
}
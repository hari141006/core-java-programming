
// Definition:
// The Fibonacci series is a sequence where each number is the sum of the previous two numbers.
// The series usually starts with 0 and 1.

class Fibonacci {

    static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;

        System.out.println("Fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
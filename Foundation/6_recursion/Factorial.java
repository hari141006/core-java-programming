
// Definition:
// The factorial of a number is the product of all positive integers up to that number.
// Recursion can be used to calculate factorial using n * factorial(n - 1).

class Factorial {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial: " + factorial(number));
    }
}
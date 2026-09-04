
// Definition:
// Sum of digits means adding all the individual digits of a number.
// Recursion can repeatedly remove the last digit and add it to the result.

class sum_of_digits {

    static int sumofdigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumofdigits(n / 10);
    }

    public static void main(String[] args) {

        int number = 12345;

        System.out.println("Sum of digits: " + sumofdigits(number));
    }
}
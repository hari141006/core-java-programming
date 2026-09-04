
// Definition:
// The recursive case is the part of a method where it calls itself.
// The recursive call should move toward the base case.

class recursivecase_example {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        // Recursive case
        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        printNumbers(5);
    }
}
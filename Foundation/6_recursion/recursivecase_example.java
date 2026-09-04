
/*
    RECURSIVE CASE

    The recursive case is the part where the method calls
    itself again.

    Each recursive call should solve a smaller version of
    the original problem.

    If the problem is not reduced, recursion will never
    reach the base case.

    Example:

    print(5)

    ↓

    print(4)

    ↓

    print(3)

    ↓

    print(2)

    ↓

    print(1)

    ↓

    print(0)

    Base Case reached.
*/

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
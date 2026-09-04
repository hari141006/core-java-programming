
// Definition:
// A base case is the condition that stops a recursive method.
// Without a base case, recursion continues indefinitely.

class basecase_example {

    static void count(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        count(n - 1);
    }

    public static void main(String[] args) {

        count(5);
    }
}

// Definition:
// Recursion is a technique where a method calls itself to solve a problem.
// Every recursive method should have a base case to stop the recursion.

class recursiontheory {

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
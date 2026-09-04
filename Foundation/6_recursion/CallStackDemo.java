
// Definition:
// The call stack stores information about active method calls.
// During recursion, every recursive call is added to the call stack.

class CallStackDemo {

    static void display(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Entering: " + n);

        display(n - 1);

        System.out.println("Returning: " + n);
    }

    public static void main(String[] args) {

        display(3);
    }
}
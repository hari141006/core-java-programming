
// Definition:
// A do-while loop executes the code at least once before checking the condition.
// It is useful when the code must execute at least one time.

public class dowhile_loop {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);
    }
}
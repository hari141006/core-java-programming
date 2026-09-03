
// Definition:
// A nested loop is a loop placed inside another loop.
// It is commonly used for patterns, tables, and grids.

public class nestedloop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
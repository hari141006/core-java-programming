
// Definition:
// The switch statement selects one block of code from multiple choices.
// It is useful when checking a variable against fixed values.

public class switchcase {
    public static void main(String[] args) {

        int day = 2;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
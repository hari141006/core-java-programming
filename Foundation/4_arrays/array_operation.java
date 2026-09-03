
// Definition:
// Array operations are actions performed on array elements.
// Common operations include sum, searching, maximum, minimum and reversing.

public class array_operation {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        System.out.println("Reverse array:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
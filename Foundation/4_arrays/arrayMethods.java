// Definition:
// The Arrays class provides built-in methods for working with arrays.
// Common methods include sort(), toString(), and binarySearch().

import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int position = Arrays.binarySearch(numbers, 30);

        System.out.println("Position of 30: " + position);
    }
}
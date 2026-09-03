// Definition:
// A jagged array is a 2D array where each row can have a different number of elements.
// It is useful when different rows need different amounts of data.

public class jaggedarray {
    public static void main(String[] args) {

        int[][] numbers = new int[3][];

        numbers[0] = new int[]{1, 2};
        numbers[1] = new int[]{3, 4, 5};
        numbers[2] = new int[]{6, 7, 8, 9};

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }
    }
}

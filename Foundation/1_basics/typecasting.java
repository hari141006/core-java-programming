
// Definition:
// Type casting is the process of converting one data type into another.
// It can be widening (automatic) or narrowing (manual).

class typecasting {
    public static void main(String[] args) {

        // Widening casting
        int number = 100;
        double value = number;

        System.out.println("Widening Casting:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + value);

        // Narrowing casting
        double price = 99.99;
        int result = (int) price;

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double: " + price);
        System.out.println("Integer: " + result);
    }
}
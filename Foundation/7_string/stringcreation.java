
/*
Java String Creation

Strings in Java can be created using string literals or the new keyword.
String literals are stored in the String Constant Pool.

    - String literal creates a String using double quotes
    - new keyword creates a new String object
    - Strings created using literals can be reused from the String Pool
    - Strings are immutable
*/

public class stringcreation {

    public static void main(String[] args) {

        // Creating String using String literal
        String s1 = "Java";

        // Creating String using new keyword
        String s2 = new String("Programming");

        // Display both Strings
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // Combining both Strings
        String s3 = s1 + " " + s2;

        // Display combined String
        System.out.println("Combined String: " + s3);
    }
}

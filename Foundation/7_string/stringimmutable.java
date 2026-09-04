
/*
Java String Immutability

String objects in Java are immutable, which means their contents
cannot be changed after the String object is created.

    - Original String cannot be modified
    - String operations create a new String
    - Helps with security and memory efficiency
    - String objects can be safely shared
*/

public class stringimmutable {

    public static void main(String[] args) {

        String s1 = "Java";

        // Attempting to modify the String
        s1.concat(" Programming");

        // Original String remains unchanged
        System.out.println("Original String: " + s1);

        // Storing the new String returned by concat()
        s1 = s1.concat(" Programming");

        // Display the new String
        System.out.println("New String: " + s1);
    }
}
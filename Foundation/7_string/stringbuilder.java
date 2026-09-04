/*
Java StringBuilder

StringBuilder is a mutable sequence of characters used for
efficient string manipulation.

    - Mutable character sequence
    - Faster than StringBuffer in single-threaded applications
    - Provides append(), insert(), delete(), replace() and reverse()
    - Not synchronized
    - Useful when frequent string modifications are required
*/

public class stringbuilder {

    public static void main(String[] args) {

        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Java");

        // Adding text at the end
        sb.append(" Programming");

        // Display StringBuilder
        System.out.println("After append: " + sb);

        // Inserting text at a specific position
        sb.insert(5, "Full Stack ");

        // Display modified StringBuilder
        System.out.println("After insert: " + sb);

        // Replacing text
        sb.replace(0, 4, "Python");

        // Display modified StringBuilder
        System.out.println("After replace: " + sb);

        // Reversing the StringBuilder
        sb.reverse();

        // Display reversed StringBuilder
        System.out.println("After reverse: " + sb);
    }
}
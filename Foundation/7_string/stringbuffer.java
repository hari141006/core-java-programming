
/*
Java StringBuffer

StringBuffer is a mutable sequence of characters.
It allows strings to be modified without creating a new String object
for every modification.

    - Mutable character sequence
    - Used to modify strings
    - Provides append(), insert(), delete() and reverse()
    - StringBuffer is synchronized and thread-safe
*/

public class stringbuffer {

    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        // Adding text at the end
        sb.append(" Programming");

        // Display StringBuffer
        System.out.println("After append: " + sb);

        // Inserting text at a specific position
        sb.insert(5, "Full Stack ");

        // Display modified StringBuffer
        System.out.println("After insert: " + sb);

        // Replacing part of the text
        sb.replace(0, 4, "Python");

        // Display modified StringBuffer
        System.out.println("After replace: " + sb);

        // Reversing the StringBuffer
        sb.reverse();

        // Display reversed StringBuffer
        System.out.println("After reverse: " + sb);
    }
}


/*
Java String Methods

String methods are built-in methods provided by the String class
to perform different operations on strings.

    - length() returns the number of characters
    - charAt() returns a character at a specified index
    - substring() extracts a part of a string
    - toUpperCase() converts the string to uppercase
    - toLowerCase() converts the string to lowercase
    - contains() checks whether a string contains specific text
    - replace() replaces characters or text
    - trim() removes leading and trailing spaces
*/

public class stringmethods {

    public static void main(String[] args) {

        String s = "  Java Programming  ";

        // Finding the length of the String
        System.out.println("Length: " + s.length());

        // Accessing character at index 2
        System.out.println("Character: " + s.charAt(2));

        // Extracting part of the String
        System.out.println("Substring: " + s.substring(2, 6));

        // Converting String to uppercase
        System.out.println("Uppercase: " + s.toUpperCase());

        // Converting String to lowercase
        System.out.println("Lowercase: " + s.toLowerCase());

        // Checking whether String contains "Java"
        System.out.println("Contains Java: " + s.contains("Java"));

        // Replacing text
        System.out.println("Replace: " + s.replace("Java", "Python"));

        // Removing spaces from beginning and end
        System.out.println("Trim: " + s.trim());
    }
}
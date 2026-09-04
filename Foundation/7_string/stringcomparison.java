
/*
Java String Comparison

Strings can be compared in Java using equals() and ==.
The equals() method compares the actual content of strings,
while == compares the references of String objects.

    - equals() compares String content
    - == compares object references
    - equals() is recommended for comparing String values
    - equalsIgnoreCase() compares strings without considering case
*/

public class stringcomparison {

    public static void main(String[] args) {

        String s1 = "Java";

        String s2 = "Java";

        String s3 = new String("Java");

        // Comparing String content using equals()
        System.out.println("s1 equals s2: " + s1.equals(s2));

        // Comparing String content
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // Comparing String references using ==
        System.out.println("s1 == s2: " + (s1 == s2));

        // Comparing String references
        System.out.println("s1 == s3: " + (s1 == s3));

        // Comparing strings without considering case
        System.out.println("Java equals java: " +
                s1.equalsIgnoreCase("java"));
    }
}
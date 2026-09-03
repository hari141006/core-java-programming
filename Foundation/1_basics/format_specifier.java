
// Definition:
// Format specifiers control how values are displayed using printf().
// Common specifiers include %d for integers, %f for decimals, and %s for strings.

class format_specifier {
    public static void main(String[] args) {

        String name = "Hariharasudhan";
        int age = 20;
        double marks = 85.75;
        char grade = 'A';

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Marks: %.2f%n", marks);
        System.out.printf("Grade: %c%n", grade);

        System.out.printf(
            "Name: %s | Age: %d | Marks: %.2f | Grade: %c%n",
            name, age, marks, grade
        );
    }
}
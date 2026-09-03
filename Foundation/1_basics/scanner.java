// Definition:
// Scanner is a Java class used to read input from the user.
// It can read integers, floating-point values, strings, and other data types.

import java.util.Scanner;

class scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
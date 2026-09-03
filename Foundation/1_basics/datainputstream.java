

// Definition:
// DataInputStream is used to read primitive data from an input stream.
// It provides methods such as readInt() and readUTF() to read data.

import java.io.DataInputStream;
import java.io.IOException;

class datainputstream {
    public static void main(String[] args) throws IOException {

        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Enter your name: ");
        String name = input.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(input.readLine());

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }
}
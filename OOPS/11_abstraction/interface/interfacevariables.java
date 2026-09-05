

/*
Interface Variables in Java

    Variables declared inside an interface are constants.

    Important points:
       - Interface variables are public by default.
       - Interface variables are static by default.
       - Interface variables are final by default.
       - Therefore, an interface variable is always:
             public static final
       - The value of an interface variable cannot be changed.
       - Interface variables can be accessed using the
        interface name.
*/

interface Constants {

    int MAX_SPEED = 120;

}

public class interfacevariables {

    public static void main(String[] args) {

        System.out.println("Maximum Speed: " + Constants.MAX_SPEED);

    }
}
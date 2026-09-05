
/*
Aggregation in Java

    Aggregation represents a HAS-A relationship between classes.
    One class contains a reference to an object of another class.

    Example:
        A Student HAS-A Address.

    Important points:
       - Aggregation represents a HAS-A relationship.
       - One class contains an object/reference of another class.
       - The contained object can exist independently.
       - It represents a weak relationship between objects.
*/

class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("City: " + address.city);
    }
}

public class aggregation {

    public static void main(String[] args) {

        Address address = new Address("Coimbatore");

        Student student = new Student("Hari", address);

        student.display();
    }
}
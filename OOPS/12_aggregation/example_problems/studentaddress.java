
/*
Student and Address - Aggregation

    This program demonstrates aggregation using a Student
    and Address relationship.

    A Student HAS-A Address.

    The Address object is created separately and then passed
    to the Student object.

    Important points:
       - Student and Address are separate classes.
       - Student contains a reference to Address.
       - Address can exist independently of Student.
       - This represents a HAS-A relationship.
       - This is an example of aggregation.
*/

class Address {

    String city;
    int pincode;

    Address(String city, int pincode) {

        this.city = city;
        this.pincode = pincode;

    }

    void displayAddress() {

        System.out.println("City: " + city);
        System.out.println("Pincode: " + pincode);

    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {

        this.name = name;
        this.address = address;

    }

    void displayStudent() {

        System.out.println("Student Name: " + name);
        address.displayAddress();

    }
}

public class studentaddress {

    public static void main(String[] args) {

        Address address = new Address("Coimbatore", 641035);

        Student student = new Student("Hari", address);

        student.displayStudent();

    }
}
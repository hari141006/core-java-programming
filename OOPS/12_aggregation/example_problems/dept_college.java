
/*
Department and College - Aggregation

    This program demonstrates aggregation between a Department
    and a College.

    A Department HAS-A College.

    The College object is created separately and passed to the
    Department object.

    Important points:
       - College is a separate class.
       - Department contains a reference to College.
       - The College object can exist independently.
       - Department uses the College object through aggregation.
       - This represents a HAS-A relationship.
*/

class College {

    String collegeName;
    String location;

    College(String collegeName, String location) {

        this.collegeName = collegeName;
        this.location = location;

    }

    void displayCollege() {

        System.out.println("College: " + collegeName);
        System.out.println("Location: " + location);

    }
}

class Department {

    String departmentName;
    College college;

    Department(String departmentName, College college) {

        this.departmentName = departmentName;
        this.college = college;

    }

    void displayDepartment() {

        System.out.println("Department: " + departmentName);
        college.displayCollege();

    }
}

public class dept_college {

    public static void main(String[] args) {

        College college = new College(
            "Sri Ramakrishna Engineering College",
            "Coimbatore"
        );

        Department department = new Department(
            "Electronics and Instrumentation Engineering",
            college
        );

        department.displayDepartment();

    }
}
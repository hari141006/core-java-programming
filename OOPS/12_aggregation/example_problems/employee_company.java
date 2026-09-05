
/*
Employee and Company - Aggregation

    This program demonstrates aggregation between an Employee
    and a Company.

    An Employee HAS-A Company.

    The Company object is created independently and then
    passed to the Employee object.

    Important points:
       - Employee and Company are separate classes.
       - Employee contains a reference to Company.
       - Company can exist independently of Employee.
       - Multiple employees can refer to the same Company object.
       - This represents a HAS-A relationship.
*/

class Company {

    String companyName;
    String location;

    Company(String companyName, String location) {

        this.companyName = companyName;
        this.location = location;

    }

    void displayCompany() {

        System.out.println("Company: " + companyName);
        System.out.println("Location: " + location);

    }
}

class Employee {

    String employeeName;
    int employeeId;
    Company company;

    Employee(String employeeName, int employeeId, Company company) {

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.company = company;

    }

    void displayEmployee() {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        company.displayCompany();

    }
}

public class employee_company {

    public static void main(String[] args) {

        Company company = new Company(
            "Tata Consultancy Services",
            "Chennai"
        );

        Employee employee = new Employee(
            "Hari",
            101,
            company
        );

        employee.displayEmployee();

    }
}
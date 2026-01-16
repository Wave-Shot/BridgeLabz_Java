package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * instanceof operator, and type casting using
 * an Employee management example.
 */

/*
 * Class Name: Employee
 *
 * Description:
 * This class represents an Employee entity and demonstrates:
 * - static variables and methods
 * - final variables
 * - instanceof operator
 * - type casting
 */
class Employee {

    // Static variable shared among all employees
    static String companyName = "Capgemini";

    // Static variable to keep count of total employees
    private static int empCount = 0;

    // Instance variables to store employee details
    private String name;
    private String designation;

    // Final variable ensures employee ID cannot be changed
    private final int id;

    // Constructor to initialize employee details
    Employee(String name, int id, String designation) {

        // Assign employee name
        this.name = name;

        // Assign employee ID
        this.id = id;

        // Assign employee designation
        this.designation = designation;

        // Increment employee count whenever a new employee is created
        empCount++;
    }

    // Static method to display employee details using instanceof
    public static void displayDetails(Object obj) {

        // Check whether the object is of type Employee
        if (obj instanceof Employee) {

            // Type casting Object to Employee
            Employee e = (Employee) obj;

            // Display employee details
            System.out.println("Employee ID: " + e.id);
            System.out.println("Employee Name: " + e.name);
            System.out.println("Designation: " + e.designation);

        } else {
            // If object is not an Employee
            System.out.println("Invalid Employee Details");
        }
    }

    // Static method to return total number of employees
    public static int displayTotalEmployees() {

        // Return static employee count
        return empCount;
    }
}

/*
 * Class Name: EmployeeManagement
 *
 * Description:
 * This class contains the main method and demonstrates
 * employee creation, static method access, and keyword usage.
 */
public class EmployeeManagement {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Employee objects
        Employee e1 = new Employee("Aayush Gautam", 121, "Software Engineer");
        Employee e2 = new Employee("Aman", 154, "DB Admin");
        Employee e3 = new Employee("Aryan", 132, "Cloud Engineer");

        // Displaying company name using static variable
        System.out.println("Company Name: " + Employee.companyName);

        // Displaying details of each employee
        Employee.displayDetails(e1);
        System.out.println();

        Employee.displayDetails(e2);
        System.out.println();

        Employee.displayDetails(e3);

        // Displaying total number of employees
        System.out.println("\nTotal number of employees: " + Employee.displayTotalEmployees());
    }
}

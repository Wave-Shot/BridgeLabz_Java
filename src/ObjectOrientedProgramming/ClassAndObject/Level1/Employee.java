/*
 * Problem Statement:
 * Write a Java program to create an Employee class, store employee
 * details, and display them using a class method.
 */

/*
 * Class Name: Employee
 *
 * Description:
 * This class represents an Employee entity with attributes such as
 * name, id, and salary. It demonstrates object creation, attribute
 * assignment, and displaying employee details using a method.
 */

// Class Employee represents an employee entity
class Employee {

    // Variable to store employee name
    String name;

    // Variable to store employee ID
    int id;

    // Variable to store employee salary
    double salary;

    /*
     * Method to display employee details
     * This method prints the values of all attributes
     */
    void displayDetails() {

        // Display employee name
        System.out.println("Employee Name: " + name);

        // Display employee ID
        System.out.println("Employee ID: " + id);

        // Display employee salary
        System.out.println("Employee Salary: " + salary);
    }

    // Main method – execution starts from here
    public static void main(String[] args) {

        // Creating an object of Employee class
        Employee employee = new Employee();

        // Assigning value to name attribute
        employee.name = "John";

        // Assigning value to id attribute
        employee.id = 101;

        // Assigning value to salary attribute
        employee.salary = 50000.0;

        // Calling the method to display employee details
        employee.displayDetails();
    }
}

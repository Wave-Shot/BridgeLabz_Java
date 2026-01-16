/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * access modifiers (public, protected, private)
 * and inheritance using Employee and Manager classes.
 */

/*
 * Class Name: Employee
 *
 * Description:
 * This class represents an Employee and demonstrates
 * how access modifiers control visibility of
 * class variables and methods.
 */
class Employee {

    // Public variable
    // Used for employee identification and accessible everywhere
    public int employeeID;

    // Protected variable
    // Accessible within the same package and subclasses
    protected String department;

    // Private variable
    // Sensitive salary data, fully encapsulated
    private double salary;

    /*
     * Setter method to update salary
     * Provides controlled and validated access
     */
    public void setSalary(double salary) {

        // Assign salary to private variable
        this.salary = salary;
    }

    /*
     * Getter method for salary
     * Provides controlled read access
     */
    public double getSalary() {

        // Return employee salary
        return salary;
    }
}

/*
 * Class Name: Manager
 *
 * Description:
 * This class represents a Manager.
 * It extends the Employee class and demonstrates
 * inheritance and access to protected and public members.
 */
class Manager extends Employee {

    /*
     * Method to display manager details
     */
    public void showManagerDetails() {

        // employeeID is public → accessible in subclass
        System.out.println("Employee ID: " + employeeID);

        // department is protected → accessible in subclass
        System.out.println("Department: " + department);

        // salary is private → NOT accessible directly
        // Accessed using public getter method
        System.out.println("Salary: " + getSalary());
    }
}

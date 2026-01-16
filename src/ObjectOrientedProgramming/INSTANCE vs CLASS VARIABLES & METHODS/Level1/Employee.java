// Employee class represents a company employee
class Employee {

    // public variable
    // Used for identification
    public int employeeID;

    // protected variable
    // Used by subclasses
    protected String department;

    // private variable
    // Sensitive salary data
    private double salary;

    /*
     * Setter method to update salary
     * Provides validation and controlled access
     */
    public void setSalary(double salary) {

        this.salary = salary;
    }

    /*
     * Getter method for salary
     */
    public double getSalary() {

        return salary;
    }
}

// Manager class extends Employee
// Demonstrates inheritance & protected access
class Manager extends Employee {

    /*
     * Method to display manager details
     */
    public void showManagerDetails() {

        // employeeID is public → accessible
        System.out.println("Employee ID: " + employeeID);

        // department is protected → accessible
        System.out.println("Department: " + department);

        // salary is private → not accessible directly
        // Accessed via getter
        System.out.println("Salary: " + getSalary());
    }
}

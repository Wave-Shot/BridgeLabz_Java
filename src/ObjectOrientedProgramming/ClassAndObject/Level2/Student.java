/*
 * Problem Statement:
 * Write a Java program to create a Student class,
 * calculate the grade based on marks, and display
 * the student report.
 */

/*
 * Class Name: Student
 *
 * Description:
 * This class represents a student entity with attributes
 * such as name, roll number, and marks. It calculates the
 * grade based on marks and displays the complete student
 * report.
 */

// Student class represents a student entity in the system
class Student {

    // Attribute to store student's name
    String name;

    // Attribute to store student's roll number
    int rollNumber;

    // Attribute to store student's marks
    int marks;

    /*
     * Method to calculate grade based on marks
     * Returns a character representing the grade
     */
    char calculateGrade() {

        // Check marks range and decide grade
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /*
     * Method to display student details and grade
     */
    void displayStudentReport() {

        // Display student name
        System.out.println("Name: " + name);

        // Display roll number
        System.out.println("Roll Number: " + rollNumber);

        // Display marks
        System.out.println("Marks: " + marks);

        // Call calculateGrade() and display grade
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method – execution starts here
    public static void main(String[] args) {

        // Creating Student object
        Student student = new Student();

        // Assigning values to attributes
        student.name = "Amit";
        student.rollNumber = 12;
        student.marks = 85;

        // Display student report
        student.displayStudentReport();
    }
}

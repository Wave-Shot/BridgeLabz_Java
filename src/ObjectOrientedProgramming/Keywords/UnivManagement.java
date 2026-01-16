package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * this keyword, and instanceof operator using
 * a university student management example.
 */

/*
 * Class Name: Student
 *
 * Description:
 * This class represents a Student entity and demonstrates:
 * - static variables and methods
 * - final variable for roll number
 * - this keyword in constructor
 * - instanceof operator for runtime type checking
 */
class Student {

    // Static variable shared across all Student objects
    public static String universityName = "SRM University";

    // Static variable to keep track of total students
    private static int studentCount = 0;

    // Instance variable to store student name
    private String name;

    // Final variable ensures roll number cannot be changed
    private final int rollNumber;

    // Instance variable to store student grade
    private char grade;

    // Constructor to initialize student details
    Student(String name, int rollNumber, char grade) {

        // Using this keyword to assign instance variables
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increment student count whenever a new student is created
        studentCount++;
    }

    // Method to display student details
    public void displayStudent() {

        // Using instanceof to verify object type
        if (this instanceof Student) {

            // Display student roll number
            System.out.println("Reg No: " + rollNumber);

            // Display student name
            System.out.println("Student Name: " + name);

            // Display student grade
            System.out.println("Grades secured: " + grade);

            System.out.println();
        } else {
            System.out.println("Invalid object instance");
        }
    }

    // Static method to return total number of students
    public static int totalStudents() {

        // Returning static student count
        return studentCount;
    }
}

/*
 * Class Name: UnivManagement
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, static member access, and keyword usage.
 */
public class UnivManagement {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Student objects
        Student s1 = new Student("Aayush", 199, 'O');
        Student s2 = new Student("Aman", 196, 'A');

        // Displaying university name using static variable
        System.out.println("University name: " + Student.universityName);

        // Displaying student details
        s1.displayStudent();
        s2.displayStudent();

        // Displaying total number of students using static method
        System.out.println("Total number of students: " + Student.totalStudents());
    }
}

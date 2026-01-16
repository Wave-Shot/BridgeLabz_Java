/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * instance variables, static variables, constructors,
 * and static methods using a Course example.
 */

/*
 * Class Name: Course
 *
 * Description:
 * This class represents a Course offered by an institute.
 * It demonstrates the use of instance variables,
 * static variables, constructor initialization,
 * and static method behavior.
 */
class Course {

    // Instance variable to store course name
    String courseName;

    // Instance variable to store course duration
    int duration;

    // Instance variable to store course fee
    double fee;

    // Static variable shared by all Course objects
    static String instituteName = "BridgeLabz";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {

        // Using this keyword to assign instance variables
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Method to display course details
    public void displayCourseDetails() {

        // Display course name, duration, and fee
        System.out.println(courseName + " | " + duration + " | " + fee);
    }

    // Static method to update institute name
    public static void updateInstituteName(String name) {

        // Update shared institute name
        instituteName = name;
    }
}

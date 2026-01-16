package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * this keyword, and instanceof operator using
 * a hospital management system.
 */

/*
 * Class Name: Patient
 *
 * Description:
 * This class represents a patient and demonstrates:
 * - static variables shared across all objects
 * - final variable for unique patient ID
 * - instance variables for patient details
 * - instanceof usage for runtime type checking
 */
class Patient {

    // Static variable shared by all Patient objects
    public static String hospitalName = "SRM Global Hospital";

    // Static variable to keep track of total patients
    private static int totalPatients = 0;

    // Instance variable to store patient name
    private String name;

    // Instance variable to store patient age
    private int age;

    // Instance variable to store patient ailment
    private String ailment;

    // Final variable ensures patient ID cannot be changed
    private final String patientID;

    // Constructor to initialize patient details
    Patient(String name, int age, String ailment, String patientID) {

        // Using this keyword to assign instance variables
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increment total patient count
        totalPatients++;
    }

    // Static method to return total number of patients
    public static int getTotalPatients() {

        // Returning static counter value
        return totalPatients;
    }

    // Method to display patient details
    public void displayDetails() {

        // Display hospital name (static variable)
        System.out.println("Hospital: " + hospitalName);

        // Display patient name
        System.out.println("Name: " + name);

        // Display patient age
        System.out.println("Age: " + age);

        // Display patient ailment
        System.out.println("Ailment: " + ailment);

        // Display patient ID
        System.out.println("Patient ID: " + patientID);

        System.out.println();
    }
}

/*
 * Class Name: HospitalManagement
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, instanceof usage, static method access,
 * and keyword functionality.
 */
public class HospitalManagement {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Patient objects
        Patient p1 = new Patient("Yash", 25, "Fever", "P001");
        Patient p2 = new Patient("Himanshu", 30, "Cold", "P002");

        // Using instanceof to check object type before calling method
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        // Displaying total number of patients using static method
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}

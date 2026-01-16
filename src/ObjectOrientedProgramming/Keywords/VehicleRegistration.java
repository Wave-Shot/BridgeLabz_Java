package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * this keyword, and instanceof operator using
 * a vehicle registration system.
 */

/*
 * Class Name: Vehicle
 *
 * Description:
 * This class represents a Vehicle entity and demonstrates:
 * - static variable for shared registration fee
 * - final variable for immutable registration number
 * - this keyword in constructor
 * - instanceof operator for runtime type checking
 */
class Vehicle {

    // Static variable shared across all Vehicle objects
    public static int registrationFees = 2000;

    // Instance variable to store vehicle owner name
    private String ownerName;

    // Instance variable to store vehicle type
    private String vehicleType;

    // Final variable ensures registration number cannot be changed
    private final String registrationNumber;

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {

        // Using this keyword to assign instance variables
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display vehicle details
    public void displayDetails() {

        // Display vehicle owner name
        System.out.println("Owner: " + ownerName);

        // Display vehicle type
        System.out.println("Vehicle Type: " + vehicleType);

        // Display registration number
        System.out.println("Registration Number: " + registrationNumber);

        // Display registration fee (static variable)
        System.out.println("Registration Fee: ₹" + registrationFees);
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(int newReg) {

        // Update shared registration fee
        registrationFees = newReg;
    }
}

/*
 * Class Name: VehicleRegistration
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, static method usage, and instanceof checking.
 */
public class VehicleRegistration {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating a Vehicle object
        Vehicle v1 = new Vehicle("Aayush", "Car", "HR26D1234");

        // Updating registration fee using static method
        Vehicle.updateRegistrationFee(6767);

        // Using instanceof to verify object type before method call
        if (v1 instanceof Vehicle) {

            // Displaying vehicle details
            v1.displayDetails();

        } else {
            System.out.println("Object is not a Vehicle.");
        }
    }
}

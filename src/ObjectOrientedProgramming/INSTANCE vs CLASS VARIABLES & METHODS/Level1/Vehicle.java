/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * instance variables, static variables, constructors,
 * and static methods using a Vehicle example.
 */

/*
 * Class Name: Vehicle
 *
 * Description:
 * This class represents a Vehicle and demonstrates:
 * - Instance variables unique to each vehicle object
 * - Static variable shared across all vehicles
 * - Constructor initialization
 * - Static method behavior
 */
class Vehicle {

    // Instance variable to store owner's name
    String ownerName;

    // Instance variable to store vehicle type
    String vehicleType;

    // Static variable shared by all Vehicle objects
    static double registrationFee = 2500;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {

        // Using this keyword to assign instance variables
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {

        // Display owner name and vehicle type
        System.out.println(ownerName + " owns " + vehicleType);
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double fee) {

        // Update shared registration fee
        registrationFee = fee;
    }
}

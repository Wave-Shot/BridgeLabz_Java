import java.util.Scanner;

// Class to calculate how many rounds an athlete must run
class AthleteRounds {

    // Method to calculate number of rounds required to complete 5 km
    // Parameters:
    // side1, side2, side3 → sides of triangular park in meters
    // Returns:
    // number of rounds required to complete 5000 meters
    public static double calculateRounds(double side1, double side2, double side3) {

        // Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance athlete wants to cover (5 km = 5000 meters)
        double totalDistance = 5000;

        // Number of rounds = total distance / perimeter
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input for all three sides of the triangle
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calling method to calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying result
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km");
    }
}

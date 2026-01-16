import java.util.Scanner;

// Creating class AthleteRounds
class AthleteRounds {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading sides of triangular park
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calculating perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance to cover in meters
        double totalDistance = 5000;

        // Calculating number of rounds
        double rounds = totalDistance / perimeter;

        // Displaying result
        System.out.println(
                "The total number of rounds the athlete will run is " + rounds
        );
    }
}

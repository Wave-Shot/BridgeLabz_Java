import java.util.Scanner;

// Creating class DistanceConversionFeet
class DistanceConversionFeet {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading distance in feet
        double feet = input.nextDouble();

        // Convert feet to yards
        double yards = feet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Displaying output
        System.out.println(
                "Distance in yards is " + yards +
                        " and in miles is " + miles
        );
    }
}

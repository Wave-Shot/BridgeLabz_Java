import java.util.Scanner;

// Creating class KmToMiles
class KmToMiles {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Reading kilometers
        double km = input.nextDouble();

        // Conversion factor
        double miles = km / 1.6;

        // Displaying output
        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );
    }
}

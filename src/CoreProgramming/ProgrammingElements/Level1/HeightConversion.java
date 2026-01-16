import java.util.Scanner;

// Creating class HeightConversion
class HeightConversion {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Height in centimeters
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double heightInches = heightCm / 2.54;

        // Convert inches to feet
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;

        // Displaying result
        System.out.println(
                "Your Height in cm is " + heightCm +
                        " while in feet is " + feet +
                        " and inches is " + inches
        );
    }
}

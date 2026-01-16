import java.util.Scanner;

// Creating class SquareSide
class SquareSide {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading perimeter
        double perimeter = input.nextDouble();

        // Calculating side
        double side = perimeter / 4;

        // Displaying output
        System.out.println(
                "The length of the side is " + side +
                        " whose perimeter is " + perimeter
        );
    }
}

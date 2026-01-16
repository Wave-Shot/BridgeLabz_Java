import java.util.Scanner;

// Class to calculate Simple Interest
class SimpleInterestCalculator {

    // Method to calculate simple interest
    // Parameters: principal amount, rate of interest, time period
    // Returns: calculated simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        // Calling method
        double interest = calculateSimpleInterest(principal, rate, time);

        // Displaying result
        System.out.println(
                "The Simple Interest is " + interest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time
        );
    }
}

import java.util.Scanner;

// Creating class DoubleOpt
class DoubleOpt {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading double values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Performing operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Displaying output
        System.out.println(
                "The results of Double Operations are " +
                        result1 + ", " + result2 + ", " +
                        result3 + ", and " + result4
        );
    }
}

import java.util.Scanner;

// Creating class BasicCalculator
class BasicCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading numbers
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Displaying result
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers " +
                        number1 + " and " + number2 + " is " +
                        addition + ", " + subtraction + ", " +
                        multiplication + ", and " + division
        );
    }
}

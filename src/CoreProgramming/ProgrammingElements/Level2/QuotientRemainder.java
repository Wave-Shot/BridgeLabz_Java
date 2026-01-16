import java.util.Scanner;

// Creating class QuotientRemainder
class QuotientRemainder {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Reading first number
        int number1 = input.nextInt();

        // Reading second number
        int number2 = input.nextInt();

        // Calculating quotient
        int quotient = number1 / number2;

        // Calculating remainder
        int remainder = number1 % number2;

        // Displaying output
        System.out.println(
                "The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + number1 + " and " + number2
        );
    }
}

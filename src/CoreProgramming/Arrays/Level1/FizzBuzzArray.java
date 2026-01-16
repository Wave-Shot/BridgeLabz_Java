import java.util.Scanner;

// Class to store FizzBuzz results in an array
class FizzBuzzArray {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Reading the input number
        int number = input.nextInt();

        // Validate positive integer input
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }

        /*
         * Creating a String array to store results
         * Index 0 is unused to match position with number (1-based indexing)
         */
        String[] results = new String[number + 1];

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {

            /*
             * If number is divisible by both 3 and 5
             * Must be checked first to avoid missing FizzBuzz
             */
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
            // If divisible only by 3
            else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
            // If divisible only by 5
            else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
            // Otherwise store the number itself
            else {
                results[i] = String.valueOf(i);
            }
        }

        // Printing the results stored in the array
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}

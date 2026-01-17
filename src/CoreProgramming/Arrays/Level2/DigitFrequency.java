import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to find the frequency of each digit
 * (0–9) in a given integer number using an array.
 */

/*
 * Class Name: DigitFrequency
 *
 * Description:
 * This class reads an integer number from the user,
 * extracts each digit, counts how many times each digit
 * occurs, and displays the frequency using an array.
 */

// Class to find frequency of digits in a number
class DigitFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Frequency array where index represents digit 0–9
        int[] frequency = new int[10];

        // Extract digits and count frequency
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Increment frequency of the digit
            frequency[digit]++;

            // Remove last digit
            number = number / 10;
        }

        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(
                    "Digit " + i + " occurs " + frequency[i] + " times"
            );
        }
    }
}

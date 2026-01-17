import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to extract all digits of a given number
 * using a dynamically resizing array and find the largest
 * and second largest digits from the number.
 */

/*
 * Class Name: DynamicDigitsArray
 *
 * Description:
 * This class demonstrates how to store digits of a number
 * using a dynamically resized array and determine the
 * largest and second largest digits among them.
 */

// Class to store digits of a number using dynamic array resizing
class DynamicDigitsArray {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Read the input number
        int number = input.nextInt();

        // Initial capacity of the digits array
        int maxDigit = 10;

        // Array to store digits of the number
        int[] digits = new int[maxDigit];

        // Index variable to track the next free position in the array
        int index = 0;

        // Loop continues until all digits are extracted
        while (number != 0) {

            /*
             * If index reaches maxDigit, it means array is full.
             * We need to increase array size to store more digits.
             */
            if (index == maxDigit) {

                // Increase capacity by 10
                maxDigit = maxDigit + 10;

                // Create a temporary array with increased size
                int[] temp = new int[maxDigit];

                // Copy old array values into the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array back to digits
                digits = temp;
            }

            // Extract the last digit of the number
            digits[index] = number % 10;

            // Move index to the next position
            index++;

            // Remove last digit from the number
            number = number / 10;
        }

        // Variables to store largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through stored digits to find largest and second largest
        for (int i = 0; i < index; i++) {

            // If current digit is greater than largest
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            // If digit is less than largest but greater than second largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}

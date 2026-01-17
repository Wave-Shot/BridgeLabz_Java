import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to extract digits from a given number
 * and find the largest and second largest digits using arrays.
 */

/*
 * Class Name: LargestSecondLargestDigit
 *
 * Description:
 * This class extracts digits from an integer number,
 * stores them in an array, and determines the largest
 * and second largest digits among them.
 */

// Class to find largest and second largest digit
class LargestSecondLargestDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        // Finding largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}

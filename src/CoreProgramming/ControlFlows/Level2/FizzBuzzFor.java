import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to print numbers from 1 to a given
 * positive number using the FizzBuzz logic.
 *
 * Rules:
 * - Print "FizzBuzz" for numbers divisible by both 3 and 5
 * - Print "Fizz" for numbers divisible by 3
 * - Print "Buzz" for numbers divisible by 5
 * - Print the number otherwise
 */

/*
 * Class Name: FizzBuzzFor
 *
 * Description:
 * This class reads a positive integer from the user and
 * uses a for loop to apply FizzBuzz rules while printing
 * values from 1 up to the given number.
 */

// Class for FizzBuzz using for loop
class FizzBuzzFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                // Multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Normal number
                else {
                    System.out.println(i);
                }
            }
        }
    }
}

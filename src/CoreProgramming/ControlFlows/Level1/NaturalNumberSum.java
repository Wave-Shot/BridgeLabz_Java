import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to check whether a given number
 * is a natural number. If it is natural, calculate and
 * display the sum of first n natural numbers.
 */

/*
 * Class Name: NaturalNumberSum
 *
 * Description:
 * This class reads a number from the user, checks whether
 * it is a natural number, and calculates the sum of first
 * n natural numbers using the mathematical formula.
 */

// Class to check natural number and compute sum
class NaturalNumberSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Checking if number is natural
        if (number > 0) {

            // Formula for sum of n natural numbers
            int sum = number * (number + 1) / 2;

            System.out.println(
                    "The sum of " + number +
                            " natural numbers is " + sum
            );

        } else {

            // Executed if number is not natural
            System.out.println(
                    "The number " + number +
                            " is not a natural number"
            );
        }
    }
}

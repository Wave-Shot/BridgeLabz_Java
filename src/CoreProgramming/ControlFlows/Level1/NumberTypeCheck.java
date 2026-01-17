import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to check whether a given number
 * is positive, negative, or zero and display the result.
 */

/*
 * Class Name: NumberTypeCheck
 *
 * Description:
 * This class reads an integer number from the user
 * and determines whether the number is positive,
 * negative, or zero using conditional statements.
 */

// Class to check number type
class NumberTypeCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Checking number type
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

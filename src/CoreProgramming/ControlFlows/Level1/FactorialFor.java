import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the factorial
 * of a given positive number using a for loop.
 */

/*
 * Class Name: FactorialFor
 *
 * Description:
 * This class reads a number from the user and
 * calculates its factorial using a for loop,
 * displaying the result if the number is positive.
 */

// Class to calculate factorial using for loop
class FactorialFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial is " + factorial);
        }
    }
}

import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the factorial
 * of a given positive number using a while loop.
 */

/*
 * Class Name: FactorialWhile
 *
 * Description:
 * This class reads a number from the user and
 * calculates its factorial using a while loop,
 * displaying the result if the number is positive.
 */

// Class to calculate factorial
class FactorialWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial is " + factorial);
        }
    }
}

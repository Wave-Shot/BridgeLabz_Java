import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the sum of first n
 * natural numbers using both the mathematical formula
 * and a while loop, and compare the results.
 */

/*
 * Class Name: NaturalSumWhile
 *
 * Description:
 * This class reads a natural number from the user,
 * calculates the sum of natural numbers using a formula
 * and a while loop, and displays both results.
 */

// Class to compare sum using while loop
class NaturalSumWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int sumFormula = number * (number + 1) / 2;
            int sumLoop = 0;
            int i = 1;

            while (i <= number) {
                sumLoop += i;
                i++;
            }

            System.out.println(
                    "Sum using formula: " + sumFormula +
                            ", Sum using while loop: " + sumLoop
            );
        }
    }
}

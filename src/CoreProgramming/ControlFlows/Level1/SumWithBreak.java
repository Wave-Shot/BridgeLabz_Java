import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to continuously accept numbers
 * from the user and calculate their sum. The program
 * should stop accepting input when the user enters
 * zero or a negative number using the break statement.
 */

/*
 * Class Name: SumWithBreak
 *
 * Description:
 * This class reads numeric values from the user using
 * an infinite loop and calculates their sum. The loop
 * terminates when a zero or negative number is entered
 * using the break statement.
 */

// Class to calculate sum using break
class SumWithBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        // Infinite loop
        while (true) {

            double value = input.nextDouble();

            // Break condition
            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}

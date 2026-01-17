import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to continuously accept numbers
 * from the user and calculate their sum until the user
 * enters zero. Finally, display the total sum.
 */

/*
 * Class Name: SumUntilZero
 *
 * Description:
 * This class reads numeric values from the user and
 * keeps adding them until the user enters 0, at which
 * point the total sum is displayed.
 */

// Class to calculate sum until zero
class SumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double value = input.nextDouble();

        // Continue until user enters 0
        while (value != 0) {
            total += value;
            value = input.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}

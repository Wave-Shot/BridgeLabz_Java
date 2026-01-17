import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to find and display all the factors
 * of a given positive number using a for loop.
 */

/*
 * Class Name: FactorsFor
 *
 * Description:
 * This class reads a positive integer from the user and
 * uses a for loop to find all numbers that divide the
 * given number completely and prints them as factors.
 */

// Class to find factors using for loop
class FactorsFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i < number; i++) {

                // Checking perfect divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

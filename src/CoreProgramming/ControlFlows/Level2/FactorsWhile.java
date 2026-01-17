import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to find and display all the factors
 * of a given positive number using a while loop.
 */

/*
 * Class Name: FactorsWhile
 *
 * Description:
 * This class accepts a positive integer from the user and
 * uses a while loop to check each number starting from 1
 * up to the given number and prints all numbers that divide
 * the input number completely.
 */

// Class to find factors using while loop
class FactorsWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int counter = 1;

        if (number > 0) {

            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++;
            }
        }
    }
}

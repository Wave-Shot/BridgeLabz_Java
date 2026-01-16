import java.util.Scanner;

/**
 * Problem Statement:
 * Write a Java program to generate the multiplication table of a given number
 * and store the results in an array.
 *
 * The program should:
 * - Take an integer input from the user
 * - Create an array of size 10 to store multiplication results
 * - Generate the multiplication table from 1 to 10
 * - Store each multiplication result in the array
 * - Display the multiplication table using the stored values
 *
 * This program demonstrates:
 * - Use of arrays
 * - Looping with for loops
 * - Storing computed values in an array
 * - User input handling using Scanner
 */

// Class to store multiplication table in array
class MultiplicationTableArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Generating multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

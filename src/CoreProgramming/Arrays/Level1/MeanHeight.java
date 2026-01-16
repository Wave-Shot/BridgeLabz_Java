import java.util.Scanner;

/**
 * Problem Statement:
 * Write a Java program to calculate the mean height of a football team.
 *
 * The program should:
 * - Take the height of 11 players as input
 * - Store the heights in an array
 * - Calculate the sum of all heights
 * - Compute the mean height using the formula:
 *   mean = sum of heights / number of players
 * - Display the mean height of the football team
 *
 * This program demonstrates:
 * - Use of arrays
 * - Looping through array elements
 * - User input handling using Scanner
 * - Basic arithmetic operations
 */

// Class to calculate mean height
class MeanHeight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean height of the football team is " + mean);
    }
}

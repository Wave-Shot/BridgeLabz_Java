import java.util.Scanner;

/**
 * Problem Statement:
 * Write a Java program to generate and display the multiplication table
 * of a given number from 6 to 9.
/*
 * Class Name: MultiplicationTableSixToNine
 *
 * Description:
 * This class reads an integer value from the user and generates
 * the multiplication table for that number starting from 6 up to 9.
 * The results are stored in an array and then printed to the console.
 */

// Class to print multiplication table from 6 to 9
class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] multiplicationResult = new int[4];

        int index = 0;

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}

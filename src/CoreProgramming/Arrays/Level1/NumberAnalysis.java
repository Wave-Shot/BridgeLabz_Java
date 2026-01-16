import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to analyze numbers stored in an array by checking
 * whether each number is positive, negative, zero, even, or odd, and then
 * compare the first and last elements of the array.
 */

/*
 * Class Name: NumberAnalysis
 *
 * Description:
 * This class accepts five integer values from the user, stores them in an array,
 * analyzes each number to determine its nature (positive, negative, zero,
 * even or odd), and finally compares the first and last elements of the array.
 */

// Class to analyze numbers in an array
class NumberAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of 5 integers
        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Checking each number
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
    }
}

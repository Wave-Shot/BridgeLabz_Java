import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to store positive numbers in an array until a
 * non-positive number is entered or the array limit is reached, and
 * then calculate and display their sum.
 */

/*
 * Class Name: StoreValues
 *
 * Description:
 * This class reads double values from the user, stores up to 10 positive
 * numbers in an array, stops input when a zero or negative value is entered,
 * and finally prints all stored values along with their total sum.
 */

// Class to store numbers and calculate sum
class StoreValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop
        while (true) {

            double value = input.nextDouble();

            // Stop if value is 0 or negative
            if (value <= 0 || index == 10) {
                break;
            }

            values[index] = value;
            index++;
        }

        // Calculating sum
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Total is " + total);
    }
}

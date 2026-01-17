import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to determine the youngest and tallest
 * among three friends. The program should take age and height
 * as input and display the name of the youngest and tallest friend.
 */

/*
 * Class Name: YoungestTallestFriends
 *
 * Description:
 * This class stores names, ages, and heights of three friends
 * using arrays and determines the youngest and tallest friend
 * based on the given input.
 */

// Class to find youngest and tallest among friends
class YoungestTallestFriends {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);
    }
}

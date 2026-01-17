import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to perform a rocket countdown
 * starting from a given number down to 1 using a for loop.
 */

/*
 * Class Name: RocketCountdownFor
 *
 * Description:
 * This class reads a number from the user and performs
 * a countdown using a for loop, printing each number
 * until it reaches 1.
 */

// Class for rocket countdown using for loop
class RocketCountdownFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

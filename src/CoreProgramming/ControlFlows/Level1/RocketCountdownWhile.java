import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to perform a rocket countdown
 * starting from a given number down to 1 using a while loop.
 */

/*
 * Class Name: RocketCountdownWhile
 *
 * Description:
 * This class reads a number from the user and performs
 * a countdown using a while loop, printing each number
 * until it reaches 1.
 */

// Class for rocket countdown
class RocketCountdownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}

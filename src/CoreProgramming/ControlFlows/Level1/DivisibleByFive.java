import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to check whether a given number
 * is divisible by 5 and display the result as true or false.
 */

/*
 * Class Name: DivisibleByFive
 *
 * Description:
 * This class reads an integer number from the user,
 * checks whether it is divisible by 5 using the modulus
 * operator, and displays the result.
 */

// Creating class DivisibleByFive
class DivisibleByFive {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Reading number from user
        int number = input.nextInt();

        // Checking divisibility by 5
        boolean isDivisible = number % 5 == 0;

        // Displaying result
        System.out.println(
                "Is the number " + number + " divisible by 5? " + isDivisible
        );
    }
}

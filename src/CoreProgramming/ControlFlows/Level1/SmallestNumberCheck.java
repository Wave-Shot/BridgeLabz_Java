import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to check whether the first
 * number is the smallest among three given numbers
 * using a boolean expression.
 */

/*
 * Class Name: SmallestNumberCheck
 *
 * Description:
 * This class reads three integer numbers from the user
 * and checks whether the first number is the smallest
 * among them using logical operators.
 */

// Creating class SmallestNumberCheck
class SmallestNumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        boolean isSmallest = number1 < number2 && number1 < number3;

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}

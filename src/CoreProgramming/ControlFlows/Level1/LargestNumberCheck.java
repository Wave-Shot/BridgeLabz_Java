import java.util.Scanner;

// Class to check largest number
class LargestNumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Checking largest
        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        // Printing results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }
}

import java.util.Scanner;

// Class to check whether a number is positive, negative or zero
class NumberCheck {

    // Method returns:
    //  1  → if number is positive
    // -1  → if number is negative
    //  0  → if number is zero
    public static int checkNumber(int number) {

        // Check if number is greater than zero
        if (number > 0) {
            return 1;
        }
        // Check if number is less than zero
        else if (number < 0) {
            return -1;
        }
        // If number is neither positive nor negative
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading integer input
        int number = input.nextInt();

        // Calling method
        int result = checkNumber(number);

        // Printing result
        System.out.println("Returned Value = " + result);
    }
}

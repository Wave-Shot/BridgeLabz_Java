import java.util.Scanner;

// Class to reverse a number using arrays
class ReverseNumberArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the input number
        int number = input.nextInt();

        // Temporary variable to count digits
        int temp = number;

        // Variable to count number of digits
        int count = 0;

        // Count how many digits are present
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Create array exactly of required size
        int[] digits = new int[count];

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        // Printing digits gives reversed number
        System.out.print("Reversed Number = ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}

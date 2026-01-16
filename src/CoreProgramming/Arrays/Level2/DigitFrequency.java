import java.util.Scanner;

// Class to find frequency of digits in a number
class DigitFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Frequency array where index represents digit 0–9
        int[] frequency = new int[10];

        // Extract digits and count frequency
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Increment frequency of the digit
            frequency[digit]++;

            // Remove last digit
            number = number / 10;
        }

        // Display frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(
                    "Digit " + i + " occurs " + frequency[i] + " times"
            );
        }
    }
}

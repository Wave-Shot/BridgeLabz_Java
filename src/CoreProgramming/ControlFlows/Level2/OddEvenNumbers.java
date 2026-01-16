import java.util.Scanner;

// Class to print odd and even numbers
class OddEvenNumbers {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Reading the number
        int number = input.nextInt();

        // Checking for natural number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Checking even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
    }
}

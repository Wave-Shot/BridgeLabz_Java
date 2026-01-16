import java.util.Scanner;

// Class to separate odd and even numbers into different arrays
class OddEvenArray {

    public static void main(String[] args) {

        // Scanner object is created to take input from the keyboard
        Scanner input = new Scanner(System.in);

        // Taking input from the user and storing it in variable 'number'
        int number = input.nextInt();

        // Checking whether the given number is a Natural Number
        // Natural numbers must be greater than 0
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a Natural Number.");
            return; // Exit the program if input is invalid
        }

        // Creating an array to store even numbers
        // Maximum possible even numbers between 1 and number is number/2
        int[] evenNumbers = new int[number / 2 + 1];

        // Creating an array to store odd numbers
        // Maximum possible odd numbers between 1 and number is number/2 + 1
        int[] oddNumbers = new int[number / 2 + 1];

        // Index variable to track position for even numbers array
        int evenIndex = 0;

        // Index variable to track position for odd numbers array
        int oddIndex = 0;

        // Looping from 1 to the given number
        for (int i = 1; i <= number; i++) {

            // Checking if the current number is even
            if (i % 2 == 0) {

                // If even, store the number in evenNumbers array
                evenNumbers[evenIndex] = i;

                // Increment evenIndex to move to the next position
                evenIndex++;

            } else {

                // If odd, store the number in oddNumbers array
                oddNumbers[oddIndex] = i;

                // Increment oddIndex to move to the next position
                oddIndex++;
            }
        }

        // Printing all odd numbers stored in the oddNumbers array
        System.out.println("Odd Numbers:");

        // Loop runs only till oddIndex, not full array size
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i]);
        }

        // Printing all even numbers stored in the evenNumbers array
        System.out.println("Even Numbers:");

        // Loop runs only till evenIndex, not full array size
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i]);
        }
    }
}

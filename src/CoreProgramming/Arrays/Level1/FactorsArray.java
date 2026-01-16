import java.util.Scanner;

// Class to find factors of a number and store them in a dynamic array
class FactorsArray {

    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Reading the number
        int number = input.nextInt();

        // Initial size of the factors array
        int maxFactor = 10;

        // Array to store factors
        int[] factors = new int[maxFactor];

        // Index variable to track how many factors are stored
        int index = 0;

        // Loop from 1 to the number to find factors
        for (int i = 1; i <= number; i++) {

            // If i divides the number completely, it is a factor
            if (number % i == 0) {

                /*
                 * If array size is full, double its size
                 * This allows storing more factors dynamically
                 */
                if (index == maxFactor) {

                    // Double the size
                    maxFactor = maxFactor * 2;

                    // Temporary array with increased size
                    int[] temp = new int[maxFactor];

                    // Copy existing factors to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign temp array back to factors
                    factors = temp;
                }

                // Store the factor in the array
                factors[index] = i;

                // Move to next index position
                index++;
            }
        }

        // Displaying all factors stored in the array
        System.out.println("Factors of the number are:");
        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
    }
}

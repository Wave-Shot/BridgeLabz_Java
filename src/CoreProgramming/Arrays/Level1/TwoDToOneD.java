import java.util.Scanner;

// Class to copy a 2D array into a 1D array
class TwoDToOneD {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Reading number of rows and columns
        int rows = input.nextInt();
        int columns = input.nextInt();

        // Creating 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Taking input for each element of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Creating 1D array of size rows * columns
        int[] array = new int[rows * columns];

        // Index to track position in 1D array
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                // Copy each element
                array[index] = matrix[i][j];

                // Increment index after each insertion
                index++;
            }
        }

        // Displaying the 1D array
        System.out.println("1D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

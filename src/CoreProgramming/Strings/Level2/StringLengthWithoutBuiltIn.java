import java.util.Scanner;

// Class to find string length without using built-in length()
class StringLengthWithoutLength {

    /*
     * Method to find length of a string without using length().
     * Logic:
     * - Use an infinite loop
     * - Access characters using charAt(index)
     * - When index exceeds string length, charAt throws exception
     * - Catch the exception and return count
     */
    public static int findLength(String text) {

        int count = 0;

        // Infinite loop until exception occurs
        while (true) {
            try {
                // Access character at index count
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                // Exception means index exceeded string length
                return count;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        String text = input.next();

        // Length using user-defined method
        int manualLength = findLength(text);

        // Length using built-in method
        int builtInLength = text.length();

        // Display both results
        System.out.println("Length without length(): " + manualLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}

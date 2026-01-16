import java.util.Scanner;

// Class to find the first non-repeating character in a string
class FirstNonRepeatingCharacter {

    /*
     * Method to find the first non-repeating character
     * A non-repeating character appears exactly once in the string
     */
    public static char findFirstNonRepeating(String text) {

        // Frequency array to store count of each character
        // Size 256 because ASCII has 256 characters
        int[] frequency = new int[256];

        // FIRST LOOP:
        // Count frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {

            // text.charAt(i) gives a character
            // Character is automatically converted to ASCII value
            // That ASCII value is used as index
            frequency[text.charAt(i)]++;
        }

        // SECOND LOOP:
        // Find the first character whose frequency is exactly 1
        for (int i = 0; i < text.length(); i++) {

            // If frequency of this character is 1,
            // then it is non-repeating
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        // If no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        // Scanner to take input
        Scanner input = new Scanner(System.in);

        // Read complete string
        String text = input.nextLine();

        // Call method
        char result = findFirstNonRepeating(text);

        // Display result
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}

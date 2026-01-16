import java.util.Scanner;

// Class to find unique characters in a string
class UniqueCharacters {

    /*
     * Method to find string length WITHOUT using length()
     * Uses charAt() until exception occurs
     */
    public static int findLength(String text) {

        int count = 0;

        // Infinite loop until exception stops execution
        while (true) {
            try {
                // Try accessing character at index 'count'
                text.charAt(count);

                // If successful, increment count
                count++;
            } catch (Exception e) {
                // Exception means index exceeded string length
                return count;
            }
        }
    }

    /*
     * Method to find unique characters
     * Logic:
     * - Outer loop selects one character
     * - Inner loop checks if it appeared earlier
     */
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[length];

        // Index to track number of unique characters
        int index = 0;

        // Outer loop → selects each character
        for (int i = 0; i < length; i++) {

            boolean isUnique = true;

            // Inner loop → checks previous characters
            for (int j = 0; j < i; j++) {

                // If character already appeared
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, store it
            if (isUnique) {
                temp[index] = text.charAt(i);
                index++;
            }
        }

        // Create exact-sized array for unique characters
        char[] uniqueChars = new char[index];

        // Copy from temp array
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {

        // Scanner to read input
        Scanner input = new Scanner(System.in);

        // Read full string
        String text = input.nextLine();

        // Find unique characters
        char[] unique = findUniqueCharacters(text);

        // Display result
        System.out.print("Unique Characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}

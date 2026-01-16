import java.util.Scanner;

// Class to find frequency of characters using ASCII logic
class CharacterFrequency {

    /*
     * Method to find character frequencies
     * Returns a 2D String array:
     * Column 0 → Character
     * Column 1 → Frequency
     */
    public static String[][] findFrequency(String text) {

        // Array to store frequency of each ASCII character
        int[] frequency = new int[256];

        // Count frequency of characters
        for (int i = 0; i < text.length(); i++) {

            // Increment frequency at ASCII index
            frequency[text.charAt(i)]++;
        }

        // Count how many unique characters exist
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create result array for unique characters
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < 256; i++) {

            // Only include characters that appeared
            if (frequency[i] > 0) {

                // Convert ASCII index back to character
                result[index][0] = String.valueOf((char) i);

                // Store frequency
                result[index][1] = String.valueOf(frequency[i]);

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read input string
        String text = input.nextLine();

        // Get frequency table
        String[][] table = findFrequency(text);

        // Display result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
}

import java.util.Scanner;

// Class to split text into words manually
class ManualStringSplit {

    /*
     * Method to find string length without length()
     */
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                return count;
            }
        }
    }

    /*
     * Method to split text into words using charAt().
     * Steps:
     * 1. Count spaces to determine number of words
     * 2. Store indexes of spaces
     * 3. Extract words using charAt()
     */
    public static String[] manualSplit(String text) {

        int length = findLength(text);
        int spaceCount = 0;

        // Count number of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = spaces + 1
        String[] words = new String[spaceCount + 1];

        int wordIndex = 0;
        String currentWord = "";

        // Extract words character by character
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = currentWord;
                currentWord = "";
            } else {
                currentWord += text.charAt(i);
            }
        }

        // Store last word
        words[wordIndex] = currentWord;

        return words;
    }

    /*
     * Method to compare two string arrays
     */
    public static boolean compareStringArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete sentence
        String text = input.nextLine();

        // Split using manual method
        String[] manualWords = manualSplit(text);

        // Split using built-in method
        String[] builtInWords = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(manualWords, builtInWords);

        System.out.println("Manual split equals built-in split? " + result);
    }
}

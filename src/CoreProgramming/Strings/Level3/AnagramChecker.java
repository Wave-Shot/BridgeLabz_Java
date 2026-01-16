import java.util.Scanner;

// Class to check if two strings are anagrams
class AnagramChecker {

    /*
     * Method to check anagram
     * Two strings are anagrams if they have same characters
     * with same frequencies
     */
    public static boolean isAnagram(String first, String second) {

        // If lengths differ, cannot be anagrams
        if (first.length() != second.length()) {
            return false;
        }

        // Frequency array for ASCII characters
        int[] frequency = new int[256];

        // Increment frequency for first string
        // Decrement frequency for second string
        for (int i = 0; i < first.length(); i++) {

            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int value : frequency) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read two strings
        String first = input.nextLine();
        String second = input.nextLine();

        // Display result
        System.out.println("Are Anagrams? " + isAnagram(first, second));
    }
}

import java.util.Scanner;

// Class to check palindrome using multiple techniques
class PalindromeChecker {

    /*
     * LOGIC 1:
     * Compare characters from start and end using loop
     */
    public static boolean isPalindromeIterative(String text) {

        // Start index at beginning
        int start = 0;

        // End index at last character
        int end = text.length() - 1;

        // Loop until indexes meet
        while (start < end) {

            // If characters do not match, not palindrome
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            // Move start forward
            start++;

            // Move end backward
            end--;
        }

        // If loop completes, string is palindrome
        return true;
    }

    /*
     * LOGIC 2:
     * Recursive palindrome check
     */
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition: indices crossed or met
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call with reduced range
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    /*
     * LOGIC 3:
     * Reverse string using charAt() and compare arrays
     */
    public static boolean isPalindromeUsingArray(String text) {

        // Convert original string to character array
        char[] original = text.toCharArray();

        // Create reverse array
        char[] reverse = new char[text.length()];

        // Fill reverse array
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read input text
        String text = input.nextLine();

        // Check using all 3 logics
        System.out.println("Iterative: " + isPalindromeIterative(text));
        System.out.println("Recursive: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Array Method: " + isPalindromeUsingArray(text));
    }
}

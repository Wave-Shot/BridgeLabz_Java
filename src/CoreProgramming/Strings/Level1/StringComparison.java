import java.util.Scanner;

// Class to compare two strings
class StringComparison {

    /*
     * User-defined method to compare two strings using charAt().
     * Step 1: If lengths are not equal, strings are not equal.
     * Step 2: Compare characters at each index.
     * Step 3: If any character mismatch, return false.
     */
    public static boolean compareUsingCharAt(String first, String second) {

        // If lengths differ, strings cannot be equal
        if (first.length() != second.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for two strings
        String string1 = input.next();
        String string2 = input.next();

        // Compare using user-defined method
        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Compare using built-in equals() method
        boolean equalsResult = string1.equals(string2);

        // Display comparison results
        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);
    }
}

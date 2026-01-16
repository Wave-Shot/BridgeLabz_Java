import java.util.Scanner;

// Class to demonstrate substring creation
class SubstringComparison {

    /*
     * Method to create substring using charAt().
     * Characters are appended one by one.
     */
    public static String createSubstringUsingCharAt(String text, int start, int end) {

        String result = "";

        // Loop from start index to end index (exclusive)
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    /*
     * Method to compare two strings using charAt()
     */
    public static boolean compareStrings(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input string and indexes
        String text = input.next();
        int startIndex = input.nextInt();
        int endIndex = input.nextInt();

        // Create substring using charAt()
        String manualSubstring = createSubstringUsingCharAt(text, startIndex, endIndex);

        // Create substring using built-in method
        String builtInSubstring = text.substring(startIndex, endIndex);

        // Compare both substrings
        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);
    }
}

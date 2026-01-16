import java.util.Scanner;

// Class to trim spaces manually
class ManualTrim {

    /*
     * Method to find start and end index without spaces
     * Returns an array with start and end indexes
     */
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Move start index forward while spaces exist
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Move end index backward while spaces exist
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    /*
     * Method to create substring using charAt()
     */
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    /*
     * Method to compare two strings using charAt()
     */
    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // Get trim indexes
        int[] indexes = findTrimIndexes(text);

        // Trim manually
        String manualTrimmed = createSubstring(text, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmed = text.trim();

        // Compare both results
        boolean result = compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("Manual Trim Result: [" + manualTrimmed + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrimmed + "]");
        System.out.println("Results Match? " + result);
    }
}

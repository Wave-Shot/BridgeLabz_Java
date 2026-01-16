import java.util.Scanner;

// Class to convert string to character array
class StringToCharArray {

    /*
     * Method to convert string to char array using charAt().
     */
    public static char[] convertUsingCharAt(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    /*
     * Method to compare two character arrays.
     */
    public static boolean compareCharArrays(char[] first, char[] second) {

        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.next();

        // Convert using user-defined method
        char[] manualArray = convertUsingCharAt(text);

        // Convert using built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(manualArray, builtInArray);

        System.out.println("Are both character arrays equal? " + result);
    }
}

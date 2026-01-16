import java.util.Scanner;

// Class to classify each character in a string
class CharacterTypeTable {

    /*
     * Method to classify a character as Vowel, Consonant, or Not a Letter
     */
    public static String classifyCharacter(char ch) {

        // Convert uppercase letter to lowercase using ASCII logic
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowels explicitly
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        // Any other character is not a letter
        return "Not a Letter";
    }

    /*
     * Method to generate a 2D array with character and its type
     */
    public static String[][] analyzeCharacters(String text) {

        String[][] result = new String[text.length()][2];

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyCharacter(text.charAt(i));
        }

        return result;
    }

    /*
     * Method to display 2D array in tabular format
     */
    public static void displayTable(String[][] table) {

        System.out.println("Character\tType");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take complete input line
        String text = input.nextLine();

        String[][] analysis = analyzeCharacters(text);
        displayTable(analysis);
    }
}

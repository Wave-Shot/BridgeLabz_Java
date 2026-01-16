import java.util.Scanner;

// Class to split words and store word with length
class WordLengthTable {

    // Reuse length method
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

    // Manual split method
    public static String[] manualSplit(String text) {

        int length = findLength(text);
        int spaces = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        String[] words = new String[spaces + 1];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        words[index] = word;
        return words;
    }

    /*
     * Method to return 2D array of word and its length
     */
    public static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordWithLength(words);

        // Display table
        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}

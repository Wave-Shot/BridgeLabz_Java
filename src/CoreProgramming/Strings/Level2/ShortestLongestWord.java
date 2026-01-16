import java.util.Scanner;

// Class to find shortest and longest word
class ShortestLongestWord {

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

    public static String[] manualSplit(String text) {

        int length = findLength(text);
        int spaces = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaces++;
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
     * Method to find shortest and longest word
     */
    public static int[] findShortestAndLongest(String[] words) {

        int min = findLength(words[0]);
        int max = findLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] words = manualSplit(text);
        int[] result = findShortestAndLongest(words);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}

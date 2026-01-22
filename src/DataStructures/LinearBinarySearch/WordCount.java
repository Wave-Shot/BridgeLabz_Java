package LinearBinarySearch;

import java.io.*;

class WordCount {
    public static void main(String[] args) throws Exception {

        // Word to search in file
        String targetWord = "java";

        // Counter to track occurrences
        int count = 0;

        // FileReader to read file
        FileReader fr = new FileReader("example.txt");

        // BufferedReader for line-by-line reading
        BufferedReader br = new BufferedReader(fr);

        // Variable to store each line
        String line;

        // Read file line by line
        while ((line = br.readLine()) != null) {

            // Split line into words using space
            String[] words = line.split("\\s+");

            // Check each word
            for (String word : words) {

                // Compare ignoring case
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }

        // Close resources
        br.close();
        fr.close();

        // Print final count
        System.out.println("Occurrences of '" +
                targetWord + "': " + count);
    }
}

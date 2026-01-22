package LinearBinarySearch;
import java.io.*;

class ReadFile {
    public static void main(String[] args) throws Exception {

        // Create FileReader to read characters from file
        FileReader fr = new FileReader("example.txt");

        // Wrap FileReader with BufferedReader for efficiency
        BufferedReader br = new BufferedReader(fr);

        // Variable to store each line read from file
        String line;

        // Read file line by line until end (null)
        while ((line = br.readLine()) != null) {

            // Print each line to console
            System.out.println(line);
        }

        // Close BufferedReader
        br.close();

        // Close FileReader
        fr.close();
    }
}

package LinearBinarySearch;
import java.io.*;

class ConsoleToFile {
    public static void main(String[] args) throws Exception {

        // InputStreamReader reads byte input from keyboard
        InputStreamReader isr = new InputStreamReader(System.in);

        // BufferedReader for efficient reading of lines
        BufferedReader br = new BufferedReader(isr);

        // FileWriter writes character data to file
        FileWriter fw = new FileWriter("output.txt");

        String input;

        System.out.println("Enter text (type 'exit' to stop):");

        // Read input until user types "exit"
        while (!(input = br.readLine()).equalsIgnoreCase("exit")) {

            // Write input to file
            fw.write(input);

            // Move to next line in file
            fw.write("\n");
        }

        // Close all resources
        fw.close();
        br.close();
        isr.close();

        System.out.println("Data written to file successfully.");
    }
}

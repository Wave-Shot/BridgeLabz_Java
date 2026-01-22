package LinearBinarySearch;
import java.io.*;

class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {

        // FileInputStream reads raw binary data (bytes) from file
        FileInputStream fis = new FileInputStream("example.txt");

        // InputStreamReader converts byte stream into character stream
        // UTF-8 charset is explicitly specified
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        // BufferedReader is used for efficient line-by-line reading
        BufferedReader br = new BufferedReader(isr);

        String line;

        // Read file line by line until end of file (null)
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // Close all resources
        br.close();
        isr.close();
        fis.close();
    }
}

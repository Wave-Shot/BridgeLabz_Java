
import java.io.*;

public class LargeCSVReader {

    public static void main(String[] args) {

        String filePath = "largefile.csv";
        int batchSize = 100;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                count++;

                if (count % batchSize == 0) {
                    System.out.println("Processed: " + count + " records");
                }
            }

            System.out.println("Total Records: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

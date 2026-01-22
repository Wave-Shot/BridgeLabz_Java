package LinearBinarySearch;
import java.io.*;

class ComparisonChallenge {
    public static void main(String[] args) throws Exception {

        int count = 1_000_000;

        /* ========== StringBuilder Performance ========== */
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("hello");
        }
        long endSB = System.nanoTime();

        /* ========== StringBuffer Performance ========== */
        long startSBF = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append("hello");
        }
        long endSBF = System.nanoTime();

        System.out.println("StringBuilder Time: " + (endSB - startSB));
        System.out.println("StringBuffer Time: " + (endSBF - startSBF));

        /* ========== FileReader Word Count ========== */
        FileReader fr = new FileReader("largefile.txt");
        BufferedReader br1 = new BufferedReader(fr);

        int wordsFR = 0;
        String line;

        while ((line = br1.readLine()) != null) {
            wordsFR += line.split("\\s+").length;
        }

        br1.close();

        /* ========== InputStreamReader Word Count ========== */
        FileInputStream fis = new FileInputStream("largefile.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br2 = new BufferedReader(isr);

        int wordsISR = 0;

        while ((line = br2.readLine()) != null) {
            wordsISR += line.split("\\s+").length;
        }

        br2.close();

        System.out.println("Words (FileReader): " + wordsFR);
        System.out.println("Words (InputStreamReader): " + wordsISR);
    }
}

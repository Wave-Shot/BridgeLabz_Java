package LinearBinarySearch;
class PerformanceTest {
    public static void main(String[] args) {

        // Number of times to append
        int count = 1_000_000;

        /* ================= StringBuilder ================= */

        // Record start time for StringBuilder
        long startBuilder = System.nanoTime();

        // Create StringBuilder object
        StringBuilder sbuilder = new StringBuilder();

        // Append "hello" multiple times
        for (int i = 0; i < count; i++) {
            sbuilder.append("hello");
        }

        // Record end time
        long endBuilder = System.nanoTime();

        /* ================= StringBuffer ================= */

        // Record start time for StringBuffer
        long startBuffer = System.nanoTime();

        // Create StringBuffer object
        StringBuffer sbuffer = new StringBuffer();

        // Append "hello" multiple times
        for (int i = 0; i < count; i++) {
            sbuffer.append("hello");
        }

        // Record end time
        long endBuffer = System.nanoTime();

        // Print time taken by StringBuilder
        System.out.println("StringBuilder Time: " +
                (endBuilder - startBuilder) + " ns");

        // Print time taken by StringBuffer
        System.out.println("StringBuffer Time: " +
                (endBuffer - startBuffer) + " ns");
    }
}

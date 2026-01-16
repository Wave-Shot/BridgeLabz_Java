// Utility class for digit calculations
class DigitAnalyzer {

    /*
     * Method to calculate sum of digits.
     */
    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int d : digits) {
            sum += d;
        }

        return sum;
    }

    /*
     * Method to calculate sum of squares of digits.
     */
    public static double sumOfSquares(int[] digits) {
        double sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, 2);
        }

        return sum;
    }

    /*
     * Harshad number check.
     * A number divisible by sum of its digits.
     */
    public static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    /*
     * Finds digit frequency using 2D array.
     * First column = digit, second column = frequency.
     */
    public static int[][] digitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency
        for (int d : digits) {
            frequency[d][1]++;
        }

        return frequency;
    }
}

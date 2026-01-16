import java.util.Random;

// Class to analyze heights of football team players
class FootballTeamHeightAnalysis {

    /*
     * Method to calculate the sum of all heights.
     * This method iterates through the array and adds each height.
     */
    public static int findSum(int[] heights) {
        int sum = 0;

        // Loop through each height and add to sum
        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    /*
     * Method to calculate the mean height.
     * Mean = Sum of all elements / Number of elements
     */
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    /*
     * Method to find the shortest height in the array.
     * Initialize min with first element and compare with others.
     */
    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }

        return min;
    }

    /*
     * Method to find the tallest height in the array.
     * Initialize max with first element and compare with others.
     */
    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // Array to store heights of 11 players
        int[] heights = new int[11];

        Random random = new Random();

        /*
         * Generate random 3-digit heights between 150 and 250 cm.
         * random.nextInt(101) gives values from 0 to 100
         */
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        // Display results
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}

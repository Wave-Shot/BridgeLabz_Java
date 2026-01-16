import java.util.Random;

// Class to generate and analyze student scores
class StudentScoreCard {

    /*
     * Method to generate random 2-digit PCM scores.
     * 2D Array Structure:
     * [i][0] -> Physics
     * [i][1] -> Chemistry
     * [i][2] -> Maths
     */
    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3];
        Random random = new Random();

        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + random.nextInt(90);
            scores[i][1] = 10 + random.nextInt(90);
            scores[i][2] = 10 + random.nextInt(90);
        }

        return scores;
    }

    /*
     * Method to calculate total, average, and percentage.
     * Returns 2D array:
     * [i][0] -> Total
     * [i][1] -> Average
     * [i][2] -> Percentage
     */
    public static double[][] calculateResults(int[][] scores) {

        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0;
            results[i][2] = Math.round(percentage * 100) / 100.0;
        }

        return results;
    }

    /*
     * Method to display student scorecard in tabular format
     */
    public static void displayScoreCard(int[][] scores, double[][] results) {

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2]
            );
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}

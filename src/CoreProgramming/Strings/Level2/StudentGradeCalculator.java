import java.util.Random;

// Class to generate grades for students
class StudentGradeCalculator {

    /*
     * Method to generate random PCM scores
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
     * Method to calculate total, average and percentage
     */
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100) / 100.0;
            result[i][2] = Math.round(percentage * 100) / 100.0;
        }

        return result;
    }

    /*
     * Method to calculate grade based on percentage
     */
    public static String[] calculateGrades(double[][] results) {

        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {

            double percent = results[i][2];

            if (percent >= 90) grades[i] = "A";
            else if (percent >= 75) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else grades[i] = "D";
        }

        return grades;
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");

        for (int i = 0; i < students; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grades[i]
            );
        }
    }
}

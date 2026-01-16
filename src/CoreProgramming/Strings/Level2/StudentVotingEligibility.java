import java.util.Random;

// Class to check voting eligibility
class StudentVotingEligibility {

    /*
     * Method to generate random 2-digit ages
     */
    public static int[] generateAges(int count) {

        int[] ages = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            ages[i] = 10 + random.nextInt(90);
        }

        return ages;
    }

    /*
     * Method to determine voting eligibility
     * Returns 2D array with age and eligibility
     */
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    /*
     * Method to display results
     */
    public static void displayTable(String[][] table) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);
        String[][] votingResult = checkVoting(ages);
        displayTable(votingResult);
    }
}

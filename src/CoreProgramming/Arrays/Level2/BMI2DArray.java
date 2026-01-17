import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the Body Mass Index (BMI)
 * of multiple persons using a 2D array. The program should
 * read weight and height, compute BMI, determine health status,
 * and display the results.
 */

/*
 * Class Name: BMI2DArray
 *
 * Description:
 * This class calculates BMI values for multiple persons
 * using a 2D array to store weight, height, and BMI,
 * along with a separate array to store BMI status.
 */

// Class to calculate BMI using 2D array
class BMI2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of persons
        int persons = input.nextInt();

        /*
         * 2D array structure:
         * personData[i][0] -> weight
         * personData[i][1] -> height
         * personData[i][2] -> BMI
         */
        double[][] personData = new double[persons][3];

        // Array to store BMI status
        String[] status = new String[persons];

        // Input and BMI calculation
        for (int i = 0; i < persons; i++) {

            personData[i][0] = input.nextDouble(); // weight
            personData[i][1] = input.nextDouble(); // height in cm

            // Convert height to meters
            double heightMeter = personData[i][1] / 100;

            // Calculate BMI
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            // Determine BMI status
            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                status[i] = "Normal";
            } else if (personData[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < persons; i++) {
            System.out.println(
                    "Weight: " + personData[i][0] +
                            " Height: " + personData[i][1] +
                            " BMI: " + personData[i][2] +
                            " Status: " + status[i]
            );
        }
    }
}

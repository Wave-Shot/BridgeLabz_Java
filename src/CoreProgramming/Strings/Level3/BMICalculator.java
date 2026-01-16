import java.util.Scanner;

// Class name clearly indicates the purpose of the program
class BMICalculator {

    /*
     * This method calculates BMI and determines BMI status
     * Input  : 2D double array where
     *          column 0 → weight in kilograms
     *          column 1 → height in centimeters
     * Output : 2D String array where
     *          column 0 → height
     *          column 1 → weight
     *          column 2 → BMI
     *          column 3 → BMI status
     */
    public static String[][] calculateBMI(double[][] personData) {

        // Creating result array to store height, weight, BMI and status
        // Rows = number of persons
        // Columns = 4 values (height, weight, BMI, status)
        String[][] result = new String[personData.length][4];

        // Loop through each person
        for (int i = 0; i < personData.length; i++) {

            // Extract weight of the current person
            // personData[i][0] → weight in kilograms
            double weight = personData[i][0];

            // Extract height of the current person
            // personData[i][1] → height in centimeters
            double heightCm = personData[i][1];

            // Convert height from centimeters to meters
            // BMI formula requires height in meters
            double heightMeter = heightCm / 100;

            // Apply BMI formula
            // BMI = weight / (height × height)
            double bmi = weight / (heightMeter * heightMeter);

            // Determine BMI category using standard BMI ranges
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store height in result array
            result[i][0] = String.valueOf(heightCm);

            // Store weight in result array
            result[i][1] = String.valueOf(weight);

            // Store BMI rounded to 2 decimal places
            result[i][2] = String.valueOf(Math.round(bmi * 100) / 100.0);

            // Store BMI status
            result[i][3] = status;
        }

        // Return completed BMI table
        return result;
    }

    /*
     * Method to display the BMI table in readable format
     */
    public static void display(String[][] table) {

        // Print table header
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        // Loop through table rows
        for (int i = 0; i < table.length; i++) {

            // Print each column value
            System.out.println(
                    table[i][0] + "\t\t" +
                            table[i][1] + "\t\t" +
                            table[i][2] + "\t" +
                            table[i][3]
            );
        }
    }

    public static void main(String[] args) {

        // Scanner object to take user input from keyboard
        Scanner input = new Scanner(System.in);

        // 2D array to store weight and height of 10 persons
        // Column 0 → weight
        // Column 1 → height
        double[][] persons = new double[10][2];

        // Loop to read data for 10 persons
        for (int i = 0; i < 10; i++) {

            // Read weight in kilograms
            persons[i][0] = input.nextDouble();

            // Read height in centimeters
            persons[i][1] = input.nextDouble();
        }

        // Call BMI calculation method
        String[][] bmiResult = calculateBMI(persons);

        // Display final BMI report
        display(bmiResult);
    }
}

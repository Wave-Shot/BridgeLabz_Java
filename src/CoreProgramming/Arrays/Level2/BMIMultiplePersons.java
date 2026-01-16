import java.util.Scanner;

// Class to calculate BMI for multiple persons
class BMIMultiplePersons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Number of persons
        int persons = input.nextInt();

        // Arrays to store data
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        // Input and BMI calculation
        for (int i = 0; i < persons; i++) {

            // Read weight in kg
            weight[i] = input.nextDouble();

            // Read height in cm
            height[i] = input.nextDouble();

            // Convert height from cm to meters
            double heightMeter = height[i] / 100;

            // Calculate BMI
            bmi[i] = weight[i] / (heightMeter * heightMeter);

            // Determine weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display all details
        for (int i = 0; i < persons; i++) {
            System.out.println(
                    "Weight: " + weight[i] +
                            " Height: " + height[i] +
                            " BMI: " + bmi[i] +
                            " Status: " + status[i]
            );
        }
    }
}

import java.util.Scanner;

// Class to calculate BMI of team members
class BMICalculatorTeam {

    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightMeter = data[i][1] / 100;

            data[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    public static String[] determineStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = input.nextDouble(); // weight
            data[i][1] = input.nextDouble(); // height
        }

        calculateBMI(data);
        String[] status = determineStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Weight: " + data[i][0] +
                            " Height: " + data[i][1] +
                            " BMI: " + data[i][2] +
                            " Status: " + status[i]
            );
        }
    }
}

import java.util.Scanner;

// Class to calculate percentage and grade of students
class StudentGradesArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {

            double physics = input.nextDouble();
            double chemistry = input.nextDouble();
            double maths = input.nextDouble();

            // Calculate percentage
            percentage[i] = (physics + chemistry + maths) / 3;

            // Assign grade
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }

        // Display results
        for (int i = 0; i < students; i++) {
            System.out.println(
                    "Percentage: " + percentage[i] +
                            " Grade: " + grade[i]
            );
        }
    }
}

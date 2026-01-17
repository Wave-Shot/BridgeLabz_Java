import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the percentage and grade
 * of multiple students using one-dimensional arrays.
 * The program should read marks for three subjects,
 * compute percentage, assign grades, and display results.
 */

/*
 * Class Name: StudentGradesArray
 *
 * Description:
 * This class calculates percentage and grade for multiple
 * students using arrays. It stores percentage and grade
 * separately and displays the final result for each student.
 */

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

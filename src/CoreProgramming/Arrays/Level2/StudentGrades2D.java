import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the percentage and grade
 * of multiple students using a 2D array to store subject marks.
 * The program should compute percentage and assign grades
 * based on predefined criteria.
 */

/*
 * Class Name: StudentGrades2D
 *
 * Description:
 * This class calculates student percentages and grades
 * using a 2D array to store marks for Physics, Chemistry,
 * and Mathematics for multiple students.
 */

// Class to calculate grades using 2D array
class StudentGrades2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        // marks[i][0] -> Physics, marks[i][1] -> Chemistry, marks[i][2] -> Maths
        double[][] marks = new double[students][3];

        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {

            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();
            }

            // Calculate percentage using 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else grade[i] = "F";
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

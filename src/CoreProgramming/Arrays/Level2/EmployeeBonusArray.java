import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate bonus and updated salary
 * for 10 employees based on their years of service.
 * The program should also calculate the total bonus paid,
 * total old salary, and total new salary.
 */

/*
 * Class Name: EmployeeBonusArray
 *
 * Description:
 * This class calculates employee bonus and revised salary
 * using arrays. Bonus is calculated based on years of service,
 * and cumulative totals are displayed at the end.
 */

// Class to calculate bonus and salary details for 10 employees
class EmployeeBonusArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Arrays to store calculated bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking input for salary and years of service
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter salary and years of service for employee " + (i + 1));
            salary[i] = input.nextDouble();
            yearsOfService[i] = input.nextDouble();

            // Validation for invalid input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--; // decrement index to re-enter same employee data
            }
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            // Bonus condition based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // New salary calculation
            newSalary[i] = salary[i] + bonus[i];

            // Adding to totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying totals
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}

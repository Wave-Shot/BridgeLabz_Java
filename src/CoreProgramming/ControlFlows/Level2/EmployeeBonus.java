import java.util.Scanner;

/*
 * Problem Statement:
 * Write a Java program to calculate the bonus of an employee
 * based on years of service. If the employee has more than
 * 5 years of service, calculate a 5% bonus on salary.
 */

/*
 * Class Name: EmployeeBonus
 *
 * Description:
 * This class reads the salary and years of service of an
 * employee and determines whether the employee is eligible
 * for a bonus. If eligible, the bonus amount is calculated
 * and displayed.
 */

// Class to calculate employee bonus
class EmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading salary
        double salary = input.nextDouble();

        // Reading years of service
        int yearsOfService = input.nextInt();

        // Checking eligibility for bonus
        if (yearsOfService > 5) {

            // Calculating 5% bonus
            double bonus = salary * 0.05;

            System.out.println("The bonus amount is INR " + bonus);

        } else {

            System.out.println("No bonus applicable");
        }
    }
}

import java.util.Random;

// Class to calculate employee bonus and salary details
class EmployeeBonusCalculator {

    /*
     * Method to generate salary and years of service for employees.
     * 2D Array Structure:
     * [i][0] -> Salary
     * [i][1] -> Years of Service
     */
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];
        Random random = new Random();

        for (int i = 0; i < employees; i++) {

            // Generate random 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + random.nextInt(90000);

            // Generate random years of service between 1 and 10
            data[i][1] = 1 + random.nextInt(10);
        }

        return data;
    }

    /*
     * Method to calculate bonus and new salary.
     * Returns a 2D array:
     * [i][0] -> Old Salary
     * [i][1] -> Bonus
     * [i][2] -> New Salary
     */
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] salaryDetails = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            // Bonus logic based on years of service
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            salaryDetails[i][0] = salary;
            salaryDetails[i][1] = bonus;
            salaryDetails[i][2] = salary + bonus;
        }

        return salaryDetails;
    }

    /*
     * Method to calculate and display totals in tabular format
     */
    public static void displaySummary(double[][] salaryDetails) {

        double totalOld = 0;
        double totalBonus = 0;
        double totalNew = 0;

        System.out.println("OldSalary\tBonus\t\tNewSalary");

        for (int i = 0; i < salaryDetails.length; i++) {

            totalOld += salaryDetails[i][0];
            totalBonus += salaryDetails[i][1];
            totalNew += salaryDetails[i][2];

            System.out.println(
                    salaryDetails[i][0] + "\t\t" +
                            salaryDetails[i][1] + "\t\t" +
                            salaryDetails[i][2]
            );
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData(10);
        double[][] salaryDetails = calculateBonus(employeeData);
        displaySummary(salaryDetails);
    }
}

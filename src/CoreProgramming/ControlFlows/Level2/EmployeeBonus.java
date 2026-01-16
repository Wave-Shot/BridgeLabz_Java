import java.util.Scanner;

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

import java.util.Scanner;

// Creating class IncomeCalculation
class IncomeCalculation {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading salary
        double salary = input.nextDouble();

        // Reading bonus
        double bonus = input.nextDouble();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Displaying output
        System.out.println(
                "The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + totalIncome
        );
    }
}

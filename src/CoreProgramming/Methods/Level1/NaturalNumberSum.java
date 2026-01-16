import java.util.Scanner;

// Class to calculate sum of natural numbers
class NaturalNumberSum {

    // Method to calculate sum using loop
    // Parameter: n → number of natural numbers
    // Returns: sum of first n natural numbers
    public static int calculateSum(int n) {

        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // add each number to sum
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading input
        int number = input.nextInt();

        // Calling method
        int result = calculateSum(number);

        // Displaying result
        System.out.println("Sum of first " + number + " natural numbers is " + result);
    }
}

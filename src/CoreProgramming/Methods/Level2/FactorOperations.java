import java.util.Scanner;

// Class to find factors and perform operations on them
class FactorOperations {

    // Method to find all factors of a number
    // This method first counts the factors, creates an array,
    // then stores all factors in the array and returns it
    public static int[] findFactors(int number) {

        // First loop to count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int value : factors) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int value : factors) {
            product *= value;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int value : factors) {
            sum += Math.pow(value, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors:");
        for (int f : factors) {
            System.out.println(f);
        }

        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(factors));
    }
}

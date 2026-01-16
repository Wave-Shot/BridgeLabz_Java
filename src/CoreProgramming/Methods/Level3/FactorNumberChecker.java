// Utility class for factor-based number analysis
class FactorNumberChecker {

    /*
     * Method to find all factors of a number.
     * Step 1: Count factors
     * Step 2: Create array of exact size
     * Step 3: Store factors and return array
     */
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact factor count
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

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Perfect number check
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum == number;
    }

    // Abundant number check
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum > number;
    }

    // Deficient number check
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number) sum += f;
        }
        return sum < number;
    }

    // Strong number check
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;

            // Factorial of digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        return sum == number;
    }
}

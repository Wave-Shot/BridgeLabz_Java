// Utility class for special number checks
class SpecialNumberChecker {

    // Prime number check
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    // Neon number check
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Spy number check
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }

    // Automorphic number check
    public static boolean isAutomorphic(int number) {
        return String.valueOf(number * number).endsWith(String.valueOf(number));
    }

    // Buzz number check
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}

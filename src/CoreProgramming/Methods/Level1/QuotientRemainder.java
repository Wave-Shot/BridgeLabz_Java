import java.util.Scanner;

// Class to calculate quotient and remainder
class QuotientRemainder {

    // Method returns:
    // index 0 → quotient
    // index 1 → remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading inputs
        int number = input.nextInt();
        int divisor = input.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying results
        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}

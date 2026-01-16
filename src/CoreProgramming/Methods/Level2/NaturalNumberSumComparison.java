import java.util.Scanner;

// Class to compare recursive sum and formula sum
class NaturalNumberSumComparison {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    // Formula based method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int recursiveResult = recursiveSum(number);
        int formulaResult = formulaSum(number);

        System.out.println("Recursive Sum = " + recursiveResult);
        System.out.println("Formula Sum = " + formulaResult);
    }
}

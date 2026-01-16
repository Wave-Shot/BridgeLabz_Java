import java.util.Scanner;

// Class to calculate sum until zero
class SumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double value = input.nextDouble();

        // Continue until user enters 0
        while (value != 0) {
            total += value;
            value = input.nextDouble();
        }

        System.out.println("The total sum is " + total);
    }
}

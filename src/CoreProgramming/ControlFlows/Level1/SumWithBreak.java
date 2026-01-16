import java.util.Scanner;

// Class to calculate sum using break
class SumWithBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        // Infinite loop
        while (true) {

            double value = input.nextDouble();

            // Break condition
            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}

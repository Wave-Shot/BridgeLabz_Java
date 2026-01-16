import java.util.Scanner;

// Class to compare sum using for loop
class NaturalSumFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int sumFormula = number * (number + 1) / 2;
            int sumLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            System.out.println(
                    "Sum using formula: " + sumFormula +
                            ", Sum using for loop: " + sumLoop
            );
        }
    }
}

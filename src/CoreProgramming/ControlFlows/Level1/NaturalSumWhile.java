import java.util.Scanner;

// Class to compare sum using while loop
class NaturalSumWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int sumFormula = number * (number + 1) / 2;
            int sumLoop = 0;
            int i = 1;

            while (i <= number) {
                sumLoop += i;
                i++;
            }

            System.out.println(
                    "Sum using formula: " + sumFormula +
                            ", Sum using while loop: " + sumLoop
            );
        }
    }
}

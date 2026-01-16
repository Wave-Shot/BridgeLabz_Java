import java.util.Scanner;

// Class to calculate factorial
class FactorialWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial is " + factorial);
        }
    }
}

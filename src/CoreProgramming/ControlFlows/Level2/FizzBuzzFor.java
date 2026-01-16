import java.util.Scanner;

// Class for FizzBuzz using for loop
class FizzBuzzFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                // Multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Normal number
                else {
                    System.out.println(i);
                }
            }
        }
    }
}

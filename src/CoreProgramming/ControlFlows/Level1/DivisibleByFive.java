import java.util.Scanner;

// Creating class DivisibleByFive
class DivisibleByFive {

    public static void main(String[] args) {

        // Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Reading number from user
        int number = input.nextInt();

        // Checking divisibility by 5
        boolean isDivisible = number % 5 == 0;

        // Displaying result
        System.out.println(
                "Is the number " + number + " divisible by 5? " + isDivisible
        );
    }
}

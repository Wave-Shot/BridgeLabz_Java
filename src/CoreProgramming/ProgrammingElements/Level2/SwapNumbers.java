import java.util.Scanner;

// Creating class SwapNumbers
class SwapNumbers {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Temporary variable for swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying swapped values
        System.out.println(
                "The swapped numbers are " +
                        number1 + " and " + number2
        );
    }
}

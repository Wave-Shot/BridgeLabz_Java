import java.util.Scanner;

// Class to analyze numbers in an array
class NumberAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of 5 integers
        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Checking each number
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
    }
}

import java.util.Scanner;

// Class to find smallest and largest number
class SmallestLargest {

    // Method returns an array:
    // index 0 → smallest number
    // index 1 → largest number
    public static int[] findSmallestAndLargest(int a, int b, int c) {

        // Assume first number as both smallest and largest initially
        int smallest = a;
        int largest = a;

        // Compare with second number
        if (b < smallest) smallest = b;
        if (b > largest) largest = b;

        // Compare with third number
        if (c < smallest) smallest = c;
        if (c > largest) largest = c;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Calling method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Printing results
        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}

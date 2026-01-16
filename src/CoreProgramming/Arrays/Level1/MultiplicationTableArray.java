import java.util.Scanner;

// Class to store multiplication table in array
class MultiplicationTableArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Generating multiplication table
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Displaying multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}

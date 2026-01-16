import java.util.Scanner;

// Class to print multiplication table
class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading number
        int number = input.nextInt();

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

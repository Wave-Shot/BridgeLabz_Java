import java.util.Scanner;

// Class to check Harshad number
class HarshadNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            sum += originalNumber % 10;
            originalNumber = originalNumber / 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}

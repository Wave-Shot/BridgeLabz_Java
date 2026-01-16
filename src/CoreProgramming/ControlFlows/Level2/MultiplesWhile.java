import java.util.Scanner;

// Class to find multiples using while loop
class MultiplesWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int counter = 100;

        if (number > 0 && number < 100) {

            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }
        }
    }
}

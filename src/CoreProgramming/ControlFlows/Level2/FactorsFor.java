import java.util.Scanner;

// Class to find factors using for loop
class FactorsFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i < number; i++) {

                // Checking perfect divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

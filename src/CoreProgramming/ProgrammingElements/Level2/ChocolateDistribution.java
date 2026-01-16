import java.util.Scanner;

// Creating class ChocolateDistribution
class ChocolateDistribution {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading total chocolates
        int numberOfChocolates = input.nextInt();

        // Reading number of children
        int numberOfChildren = input.nextInt();

        // Chocolates per child
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying output
        System.out.println(
                "The number of chocolates each child gets is " +
                        chocolatesPerChild +
                        " and the number of remaining chocolates are " +
                        remainingChocolates
        );
    }
}

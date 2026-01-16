import java.util.Scanner;

// Creating class PurchaseCalculation
class PurchaseCalculation {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading unit price and quantity
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Total price calculation
        double totalPrice = unitPrice * quantity;

        // Displaying output
        System.out.println(
                "The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice
        );
    }
}

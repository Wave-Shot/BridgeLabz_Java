import java.util.Scanner;

// Creating class FeeDiscountInput
class FeeDiscountInput {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading fee
        double fee = input.nextDouble();

        // Reading discount percent
        double discountPercent = input.nextDouble();

        // Calculating discount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculating final fee
        double finalFee = fee - discountAmount;

        // Displaying result
        System.out.println(
                "The discount amount is INR " + discountAmount +
                        " and final discounted fee is INR " + finalFee
        );
    }
}

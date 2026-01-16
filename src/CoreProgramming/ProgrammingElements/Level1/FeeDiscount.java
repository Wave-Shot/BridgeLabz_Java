// Creating class FeeDiscount
class FeeDiscount {

    public static void main(String[] args) {

        // Original fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculating discount
        double discountAmount = (fee * discountPercent) / 100;

        // Final fee calculation
        double finalFee = fee - discountAmount;

        // Displaying result
        System.out.println(
                "The discount amount is INR " + discountAmount +
                        " and final discounted fee is INR " + finalFee
        );
    }
}

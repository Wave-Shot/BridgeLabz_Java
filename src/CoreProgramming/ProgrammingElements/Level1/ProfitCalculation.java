// Creating class ProfitCalculation
class ProfitCalculation {

    public static void main(String[] args) {

        // Cost price
        double costPrice = 129;

        // Selling price
        double sellingPrice = 191;

        // Calculating profit
        double profit = sellingPrice - costPrice;

        // Calculating profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Displaying result using single print statement
        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and Selling Price is INR " + sellingPrice + "\n" +
                        "The Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercentage
        );
    }
}

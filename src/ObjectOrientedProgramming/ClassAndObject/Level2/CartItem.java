// CartItem class represents an item in shopping cart
class CartItem {

    // Attribute to store item name
    String itemName;

    // Attribute to store price per item
    double price;

    // Attribute to store quantity
    int quantity;

    /*
     * Method to add item quantity
     */
    void addItem(int qty) {

        // Increase quantity
        quantity = quantity + qty;

        // Display confirmation
        System.out.println(qty + " items added to cart");
    }

    /*
     * Method to remove item quantity
     */
    void removeItem(int qty) {

        // Ensure quantity does not go negative
        if (qty <= quantity) {
            quantity = quantity - qty;
            System.out.println(qty + " items removed from cart");
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    /*
     * Method to calculate and display total cost
     */
    void displayTotalCost() {

        // Total cost = price × quantity
        double totalCost = price * quantity;

        // Display total cost
        System.out.println("Total Cost: INR " + totalCost);
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating CartItem object
        CartItem item = new CartItem();

        // Assign item details
        item.itemName = "Notebook";
        item.price = 50.0;
        item.quantity = 0;

        // Add items to cart
        item.addItem(5);

        // Remove items from cart
        item.removeItem(2);

        // Display total cost
        item.displayTotalCost();
    }
}

/*
 * Problem Statement:
 * Write a Java program to create an Item class, calculate the total
 * cost for a given quantity, and display item details.
 */

/*
 * Class Name: Item
 *
 * Description:
 * This class represents an inventory item with attributes such as
 * item code, item name, and price. It provides methods to calculate
 * the total cost based on quantity and to display item details.
 */

// Class Item represents an inventory item
class Item {

    // Variable to store item code
    int itemCode;

    // Variable to store item name
    String itemName;

    // Variable to store price per item
    double price;

    /*
     * Method to calculate total cost for given quantity
     */
    double calculateTotalCost(int quantity) {

        // Total cost = price per item × quantity
        return price * quantity;
    }

    /*
     * Method to display item details
     */
    void displayItemDetails() {

        // Display item code
        System.out.println("Item Code: " + itemCode);

        // Display item name
        System.out.println("Item Name: " + itemName);

        // Display item price
        System.out.println("Item Price: INR " + price);
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating object of Item class
        Item item = new Item();

        // Assigning item code
        item.itemCode = 501;

        // Assigning item name
        item.itemName = "Pen";

        // Assigning item price
        item.price = 10.0;

        // Quantity of items purchased
        int quantity = 5;

        // Display item details
        item.displayItemDetails();

        // Calculate total cost
        double totalCost = item.calculateTotalCost(quantity);

        // Display total cost
        System.out.println("Total Cost for " + quantity + " items: INR " + totalCost);
    }
}

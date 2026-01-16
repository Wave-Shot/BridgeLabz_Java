package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * this keyword, and instanceof operator using
 * a shopping cart example.
 */

/*
 * Class Name: Product
 *
 * Description:
 * This class represents a product and demonstrates:
 * - static variable and static method for discount
 * - final variable for product ID
 * - this keyword in constructor
 * - instanceof operator for runtime checking
 */
class Product {

    // Static variable shared across all Product objects
    private static double discount = 0.0;

    // Instance variable to store product name
    private String productName;

    // Instance variable to store product price
    private double price;

    // Instance variable to store product quantity
    private int quantity;

    // Final variable ensures product ID cannot be changed
    private final int productId;

    // Constructor to initialize product details
    Product(String productName, int quantity, double price, int productId) {

        // Using this keyword to assign instance variables
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.productName = productName;
    }

    // Static method to update discount for all products
    public static void updateDiscount(double newDiscount) {

        // Update shared discount value
        discount = newDiscount;
    }

    // Method to display product details
    public void displayDetails() {

        // Using instanceof to ensure object type safety
        if (this instanceof Product) {

            // Display product ID
            System.out.println("Product ID: " + productId);

            // Display product name
            System.out.println("Product Name: " + productName);

            // Display product price
            System.out.println("Price: ₹" + price);

            // Display product quantity
            System.out.println("Quantity: " + quantity);

            // Calculate discounted price for one product
            double discountedPrice = price - (price * discount / 100);

            // Display discounted price
            System.out.println("Price of 1 product after discount: ₹" + discountedPrice);

        } else {
            System.out.println("Invalid Product object");
        }
    }
}

/*
 * Class Name: ShoppingCart
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, static method usage, and keyword behavior.
 */
public class ShoppingCart {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating Product objects
        Product p1 = new Product("Book", 12, 99, 887);
        Product p2 = new Product("Pen", 28, 15, 123);
        Product p3 = new Product("Bag", 5, 1989, 432);

        // Updating discount using static method
        Product.updateDiscount(10.0);

        // Displaying product details
        p1.displayDetails();
        System.out.println();

        p2.displayDetails();
        System.out.println();

        p3.displayDetails();
    }
}

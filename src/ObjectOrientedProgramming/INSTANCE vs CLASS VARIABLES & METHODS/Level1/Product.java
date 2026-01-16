/*
 * Problem Statement:
 * Write a Java program to demonstrate the difference
 * between instance variables and class (static) variables
 * using a Product example.
 */

/*
 * Class Name: Product
 *
 * Description:
 * This class represents a Product and demonstrates:
 * - Instance variables that are unique for each object
 * - Static variable shared across all objects
 * - Constructor behavior with static counter
 * - Static and non-static methods
 */
class Product {

    // Instance variable
    // Unique for each Product object
    String productName;

    // Instance variable
    // Stores price of the product
    double price;

    // Static variable (class variable)
    // Shared among all Product objects
    static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {

        // Using this keyword to assign instance variables
        this.productName = productName;
        this.price = price;

        // Increment static counter when a new product is created
        totalProducts++;
    }

    // Method to display individual product details
    public void displayProductDetails() {

        // Display product name and price
        System.out.println(productName + " : " + price);
    }

    // Static method to display total number of products
    public static void displayTotalProducts() {

        // Display static variable value
        System.out.println("Total Products: " + totalProducts);
    }
}

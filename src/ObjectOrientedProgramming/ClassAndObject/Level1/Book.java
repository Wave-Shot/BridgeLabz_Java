// Class Book represents a book entity
class Book {

    // Variable to store book title
    String title;

    // Variable to store book author name
    String author;

    // Variable to store book price
    double price;

    /*
     * Method to display book details
     */
    void displayBookDetails() {

        // Print book title
        System.out.println("Book Title: " + title);

        // Print book author
        System.out.println("Author: " + author);

        // Print book price
        System.out.println("Price: INR " + price);
    }

    // Main method – entry point of program
    public static void main(String[] args) {

        // Creating object of Book class
        Book book = new Book();

        // Assigning value to title
        book.title = "Java Programming";

        // Assigning value to author
        book.author = "James Gosling";

        // Assigning value to price
        book.price = 799.0;

        // Calling method to display book details
        book.displayBookDetails();
    }
}

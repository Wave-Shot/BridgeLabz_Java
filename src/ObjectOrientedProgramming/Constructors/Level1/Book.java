// Book class represents a book entity
class Book {

    // Private attributes to enforce encapsulation
    private String title;
    private String author;
    private double price;

    // Default constructor
    // Used when no values are provided
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    // Uses 'this' keyword to avoid ambiguity
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println(title + " by " + author + " | Price: " + price);
    }
}

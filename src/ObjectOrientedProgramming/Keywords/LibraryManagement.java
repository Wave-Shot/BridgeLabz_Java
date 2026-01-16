package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static variables, static methods, final variables,
 * this keyword, and instanceof operator using
 * a library management system.
 */

/*
 * Class Name: Book
 *
 * Description:
 * This class represents a Book entity and demonstrates:
 * - static variable and static method
 * - final variable for ISBN
 * - this keyword in constructor
 * - instanceof operator for runtime checking
 */
class Book {

    // Static variable shared by all Book objects
    private static String libraryName = "Blue Tokai Library";

    // Instance variables to store book details
    private String title;
    private String author;

    // Final variable ensures ISBN cannot be changed
    private final int isbn;

    // Constructor to initialize book details
    Book(String title, String author, int isbn) {

        // Using this keyword to assign instance variables
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {

        // Display shared library name
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayDetails() {

        // Using instanceof to verify object type
        if (this instanceof Book) {

            // Display book title
            System.out.println("Book Title: " + title);

            // Display author name
            System.out.println("Author: " + author);

            // Display ISBN number
            System.out.println("ISBN: " + isbn);

        } else {
            System.out.println("Invalid Book object");
        }
    }
}

/*
 * Class Name: LibraryManagement
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, static method access, and keyword usage.
 */
public class LibraryManagement {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Calling static method using class name
        Book.displayLibraryName();

        // Creating Book objects
        Book b1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 12345);
        Book b2 = new Book("Three Men in a Boat", "Jerome K. Jerome", 67890);

        // Displaying details of first book
        b1.displayDetails();
        System.out.println("-------------------");

        // Displaying details of second book
        b2.displayDetails();
    }
}

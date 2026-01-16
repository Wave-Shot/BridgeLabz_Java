/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * access modifiers (public, protected, private)
 * along with inheritance using Book and EBook classes.
 */

/*
 * Class Name: Book
 *
 * Description:
 * This class represents a physical book and demonstrates
 * how access modifiers control visibility of class members.
 */
class Book {

    // Public variable
    // Can be accessed from anywhere
    public String ISBN;

    // Protected variable
    // Accessible within the same package and subclasses
    protected String title;

    // Private variable
    // Encapsulated – cannot be accessed directly outside this class
    private String author;

    /*
     * Setter method for author
     * Provides controlled write access to private variable
     */
    public void setAuthor(String author) {

        // Assign value to private variable using this keyword
        this.author = author;
    }

    /*
     * Getter method for author
     * Provides controlled read access to private variable
     */
    public String getAuthor() {

        // Return author name
        return author;
    }
}

/*
 * Class Name: EBook
 *
 * Description:
 * This class represents an electronic book.
 * It extends the Book class and demonstrates
 * inheritance and access to protected and public members.
 */
class EBook extends Book {

    /*
     * Method to display eBook details
     */
    public void displayEBookDetails() {

        // ISBN is public → accessible in subclass
        System.out.println("ISBN: " + ISBN);

        // title is protected → accessible in subclass
        System.out.println("Title: " + title);

        // author is private → NOT accessible directly
        // Accessed using public getter method
        System.out.println("Author: " + getAuthor());
    }
}

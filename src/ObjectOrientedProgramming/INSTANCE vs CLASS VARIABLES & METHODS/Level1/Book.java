// Book class represents a physical book
class Book {

    // public variable
    // Can be accessed from anywhere
    public String ISBN;

    // protected variable
    // Accessible within package and subclasses
    protected String title;

    // private variable
    // Encapsulated – cannot be accessed directly outside this class
    private String author;

    /*
     * Setter method for author
     * Provides controlled write access
     */
    public void setAuthor(String author) {

        // Assigning value to private variable
        this.author = author;
    }

    /*
     * Getter method for author
     * Provides controlled read access
     */
    public String getAuthor() {

        return author;
    }
}

// EBook class extends Book
// Demonstrates inheritance and protected access
class EBook extends Book {

    /*
     * Method to display ebook details
     */
    public void displayEBookDetails() {

        // ISBN is public → accessible
        System.out.println("ISBN: " + ISBN);

        // title is protected → accessible in subclass
        System.out.println("Title: " + title);

        // author is private → cannot access directly
        // Must use getter
        System.out.println("Author: " + getAuthor());
    }
}

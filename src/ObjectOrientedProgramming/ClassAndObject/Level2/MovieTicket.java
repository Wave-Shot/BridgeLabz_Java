/*
 * Problem Statement:
 * Write a Java program to create a MovieTicket class to book a ticket
 * and display ticket details.
 */

/*
 * Class Name: MovieTicket
 *
 * Description:
 * This class represents a movie ticket with attributes such as
 * movie name, seat number, and price. It provides methods to book
 * a ticket and display ticket details.
 */

// MovieTicket class represents a movie ticket
class MovieTicket {

    // Attribute to store movie name
    String movieName;

    // Attribute to store seat number
    int seatNumber;

    // Attribute to store ticket price
    double price;

    /*
     * Method to book ticket
     * Assigns seat number and updates price
     */
    void bookTicket(int seat, double ticketPrice) {

        // Assign seat number
        seatNumber = seat;

        // Assign ticket price
        price = ticketPrice;

        // Display booking confirmation
        System.out.println("Ticket booked successfully!");
    }

    /*
     * Method to display ticket details
     */
    void displayTicketDetails() {

        // Display movie name
        System.out.println("Movie Name: " + movieName);

        // Display seat number
        System.out.println("Seat Number: " + seatNumber);

        // Display ticket price
        System.out.println("Ticket Price: INR " + price);
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Assign movie name
        ticket.movieName = "Inception";

        // Book ticket
        ticket.bookTicket(25, 350.0);

        // Display ticket details
        ticket.displayTicketDetails();
    }
}

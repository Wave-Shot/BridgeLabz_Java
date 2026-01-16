/*
 * Problem Statement:
 * Write a Java program to demonstrate constructor overloading
 * and constructor chaining using a HotelBooking class.
 */

/*
 * Class Name: HotelBooking
 *
 * Description:
 * This class represents a hotel booking system and demonstrates
 * constructor overloading. It includes a default constructor that
 * uses constructor chaining, a parameterized constructor, and a
 * copy constructor to create a new object from an existing one.
 */

class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}

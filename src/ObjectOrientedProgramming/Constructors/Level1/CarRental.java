/*
 * Problem Statement:
 * Write a Java program to calculate and display the total
 * rental cost for a car based on rental days.
 */

/*
 * Class Name: CarRental
 *
 * Description:
 * This class represents a car rental system where customer
 * details and rental duration are stored. It calculates the
 * total rental cost based on the number of rental days and
 * displays the rental bill.
 */

class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Logic kept outside constructor
    private double calculateCost() {
        return rentalDays * 1500;
    }

    public void displayBill() {
        System.out.println(customerName + " | " + carModel + " | Cost: " + calculateCost());
    }
}

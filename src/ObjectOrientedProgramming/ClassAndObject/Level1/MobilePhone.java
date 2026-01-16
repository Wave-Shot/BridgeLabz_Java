// Class MobilePhone represents a mobile phone
class MobilePhone {

    // Variable to store mobile brand
    String brand;

    // Variable to store mobile model
    String model;

    // Variable to store mobile price
    double price;

    /*
     * Method to display mobile phone details
     */
    void displayPhoneDetails() {

        // Display mobile brand
        System.out.println("Brand: " + brand);

        // Display mobile model
        System.out.println("Model: " + model);

        // Display mobile price
        System.out.println("Price: INR " + price);
    }

    // Main method – starting point of program
    public static void main(String[] args) {

        // Creating object of MobilePhone class
        MobilePhone phone = new MobilePhone();

        // Assigning brand
        phone.brand = "Samsung";

        // Assigning model
        phone.model = "Galaxy S23";

        // Assigning price
        phone.price = 74999.0;

        // Display mobile phone details
        phone.displayPhoneDetails();
    }
}

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

// Creating class DistanceConversion
class DistanceConversion {

    public static void main(String[] args) {

        // Distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double kmToMiles = 1.6;

        // Converting kilometers to miles
        double miles = kilometers / kmToMiles;

        // Displaying result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

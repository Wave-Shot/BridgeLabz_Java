import java.util.Scanner;

// Creating class TravelComputationInput
class TravelComputationInput {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading traveler name
        String name = input.next();

        // Reading city names
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        // Reading distances in miles
        double distanceFromToVia = input.nextDouble();
        double distanceViaToFinalCity = input.nextDouble();

        // Reading time in minutes
        int timeFromToVia = input.nextInt();
        int timeViaToFinalCity = input.nextInt();

        // Calculating total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculating total time
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Displaying travel details
        System.out.println(
                "The Total Distance travelled by " + name +
                        " from " + fromCity +
                        " to " + toCity +
                        " via " + viaCity +
                        " is " + totalDistance +
                        " miles and the Total Time taken is " +
                        totalTime + " minutes"
        );
    }
}

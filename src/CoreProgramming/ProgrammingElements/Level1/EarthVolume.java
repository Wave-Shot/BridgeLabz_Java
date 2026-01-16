// Creating class EarthVolume
class EarthVolume {

    public static void main(String[] args) {

        // Radius of earth in kilometers
        double radiusKm = 6378;

        // Value of Pi
        double pi = Math.PI;

        // Volume calculation in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Conversion factor from km to miles
        double kmToMiles = 0.621371;

        // Radius in miles
        double radiusMiles = radiusKm * kmToMiles;

        // Volume calculation in cubic miles
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Displaying result
        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                        " and cubic miles is " + volumeMiles
        );
    }
}

import java.util.Scanner;

// Class to calculate wind chill temperature
class WindChillCalculator {

    // Method to calculate wind chill temperature
    // Parameters:
    // temperature → air temperature
    // windSpeed → wind speed
    public static double calculateWindChill(double temperature, double windSpeed) {

        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading temperature and wind speed
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        // Calling method
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying result
        System.out.println("Wind Chill Temperature = " + windChill);
    }
}

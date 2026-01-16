import java.util.Scanner;

// Creating class CelsiusToFahrenheit
class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading temperature in Celsius
        double celsius = input.nextDouble();

        // Converting to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Displaying output
        System.out.println(
                "The " + celsius + " celsius is " +
                        fahrenheitResult + " fahrenheit"
        );
    }
}

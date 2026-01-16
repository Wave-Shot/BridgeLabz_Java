import java.util.Scanner;

// Creating class FahrenheitToCelsius
class FahrenheitToCelsius {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading temperature in Fahrenheit
        double fahrenheit = input.nextDouble();

        // Converting to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Displaying result
        System.out.println(
                "The " + fahrenheit + " fahrenheit is " +
                        celsiusResult + " celsius"
        );
    }
}

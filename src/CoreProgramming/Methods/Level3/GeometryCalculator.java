import java.util.Scanner;

// Class for geometry calculations
class GeometryCalculator {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and intercept
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Distance = " + calculateDistance(x1, y1, x2, y2));

        double[] line = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
    }
}

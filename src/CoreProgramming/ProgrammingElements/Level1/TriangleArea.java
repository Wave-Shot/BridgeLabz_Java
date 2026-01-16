import java.util.Scanner;

// Creating class TriangleArea
class TriangleArea {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading base and height
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Area calculation
        double area = 0.5 * base * height;

        // Displaying output
        System.out.println("The area of triangle is " + area);
    }
}

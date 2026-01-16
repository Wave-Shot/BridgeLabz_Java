/*
 * Problem Statement:
 * Write a Java program to create a Circle class and calculate
 * the area and circumference of a circle.
 */

/*
 * Class Name: Circle
 *
 * Description:
 * This class represents a geometric circle with a radius attribute.
 * It provides methods to calculate the area and circumference of
 * the circle and demonstrates method invocation using an object.
 */

// Class Circle represents a geometric circle
class Circle {

    // Variable to store radius of the circle
    double radius;

    /*
     * Method to calculate area of the circle
     * Formula: Area = π × r × r
     */
    double calculateArea() {

        // Returning calculated area
        return Math.PI * radius * radius;
    }

    /*
     * Method to calculate circumference of the circle
     * Formula: Circumference = 2 × π × r
     */
    double calculateCircumference() {

        // Returning calculated circumference
        return 2 * Math.PI * radius;
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating object of Circle class
        Circle circle = new Circle();

        // Assigning radius value
        circle.radius = 7.0;

        // Calling method to calculate area
        double area = circle.calculateArea();

        // Calling method to calculate circumference
        double circumference = circle.calculateCircumference();

        // Displaying the area of the circle
        System.out.println("Area of Circle: " + area);

        // Displaying the circumference of the circle
        System.out.println("Circumference of Circle: " + circumference);
    }
}

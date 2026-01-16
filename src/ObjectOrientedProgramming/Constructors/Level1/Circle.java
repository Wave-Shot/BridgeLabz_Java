/*
 * Problem Statement:
 * Write a Java program to demonstrate constructor chaining
 * using a Circle class.
 */

/*
 * Class Name: Circle
 *
 * Description:
 * This class demonstrates constructor chaining in Java.
 * The default constructor calls the parameterized constructor
 * using the 'this' keyword. The class also provides a method
 * to calculate the area of the circle.
 */

// Circle class demonstrates constructor chaining
class Circle {

    private double radius;

    // Default constructor calls parameterized constructor
    public Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

import java.util.Scanner;

// Class to create calculator using switch-case
class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        switch (op) {

            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                System.out.println("Result: " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

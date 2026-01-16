import java.util.Scanner;

// Class to calculate maximum handshakes
class HandshakeCalculator {

    // Method to calculate handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}

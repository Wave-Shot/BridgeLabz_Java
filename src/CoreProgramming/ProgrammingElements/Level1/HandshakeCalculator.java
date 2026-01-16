import java.util.Scanner;

// Creating class HandshakeCalculator
class HandshakeCalculator {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading number of students
        int numberOfStudents = input.nextInt();

        // Handshake formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying output
        System.out.println(
                "The maximum number of handshakes possible is " + handshakes
        );
    }
}

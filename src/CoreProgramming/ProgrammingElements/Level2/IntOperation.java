import java.util.Scanner;

// Creating class IntOperation
class IntOperation {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Reading integer values
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Performing integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Displaying results
        System.out.println(
                "The results of Int Operations are " +
                        result1 + ", " + result2 + ", " +
                        result3 + ", and " + result4
        );
    }
}

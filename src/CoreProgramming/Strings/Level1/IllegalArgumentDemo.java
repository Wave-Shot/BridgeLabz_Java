import java.util.Scanner;

// Class to demonstrate IllegalArgumentException
class IllegalArgumentDemo {

    public static void generateException(String text) {
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();

        // generateException(text);
        handleException(text);
    }
}

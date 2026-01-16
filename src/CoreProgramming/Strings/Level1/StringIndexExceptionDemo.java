import java.util.Scanner;

// Class to demonstrate StringIndexOutOfBoundsException
class StringIndexExceptionDemo {

    public static void generateException(String text) {
        // Accessing invalid index
        text.charAt(text.length());
    }

    public static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();

        // generateException(text);
        handleException(text);
    }
}

import java.util.Scanner;

// Class to demonstrate NumberFormatException
class NumberFormatDemo {

    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();

        // generateException(text);
        handleException(text);
    }
}

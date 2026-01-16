// Class to demonstrate NullPointerException
class NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;

        // Calling method on null reference causes exception
        text.length();
    }

    // Method to handle NullPointerException
    public static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled safely.");
        }
    }

    public static void main(String[] args) {

        // This will crash the program
        // generateException();

        // Refactored safe execution
        handleException();
    }
}

import java.util.Scanner;

// Class to demonstrate ArrayIndexOutOfBoundsException
class ArrayIndexExceptionDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        // generateException(names);
        handleException(names);
    }
}

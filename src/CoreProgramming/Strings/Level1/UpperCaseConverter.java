import java.util.Scanner;

// Class to convert string to uppercase
class UpperCaseConverter {

    public static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String manualUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Conversion correct? " +
                compareStrings(manualUpper, builtInUpper));
    }
}

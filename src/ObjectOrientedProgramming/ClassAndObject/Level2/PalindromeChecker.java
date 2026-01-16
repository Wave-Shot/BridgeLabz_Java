// PalindromeChecker class checks if a string is palindrome
class PalindromeChecker {

    // Attribute to store text
    String text;

    /*
     * Method to check if the text is palindrome
     * A palindrome reads same forward and backward
     */
    boolean isPalindrome() {

        // Initialize start index
        int start = 0;

        // Initialize end index
        int end = text.length() - 1;

        // Loop until start index is less than end index
        while (start < end) {

            // Compare characters from start and end
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            // Move start forward
            start++;

            // Move end backward
            end--;
        }

        // If no mismatch found, return true
        return true;
    }

    /*
     * Method to display palindrome result
     */
    void displayResult() {

        // Check palindrome and display result
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Assign text
        checker.text = "madam";

        // Display result
        checker.displayResult();
    }
}

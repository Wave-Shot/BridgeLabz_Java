// Utility class for palindrome checking
class PalindromeChecker {

    /*
     * Method to reverse an array.
     */
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    /*
     * Method to compare two arrays.
     */
    public static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    /*
     * Palindrome check using reversed digits.
     */
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }
}

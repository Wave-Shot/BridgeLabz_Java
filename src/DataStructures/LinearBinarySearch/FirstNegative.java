package LinearBinarySearch;
class FirstNegative {
    static int findFirstNegative(int[] arr) {

        // Traverse array from start
        for (int i = 0; i < arr.length; i++) {

            // Check if element is negative
            if (arr[i] < 0) {
                return i;
            }
        }

        // If no negative number found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, -3, 4};
        System.out.println(findFirstNegative(arr));
    }
}

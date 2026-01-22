package LinearBinarySearch;
import java.util.Arrays;

class FinalChallenge {

    static int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);

        int expected = 1;
        for (int num : arr) {
            if (num == expected)
                expected++;
        }
        return expected;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

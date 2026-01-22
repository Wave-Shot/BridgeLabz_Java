package sorting;
/*
Quick Sort:
- Select a pivot element
- Partition array around pivot
- Recursively sort left and right parts
*/

class QuickSortProductPrices {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition index
            int p = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, p - 1);

            // Sort right part
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;       // Index of smaller element

        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {999, 499, 1999, 799, 299};
        quickSort(prices, 0, prices.length - 1);

        for (int p : prices)
            System.out.print(p + " ");
    }
}

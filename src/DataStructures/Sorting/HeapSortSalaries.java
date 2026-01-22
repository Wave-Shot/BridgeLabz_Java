package sorting;
/*
Heap Sort:
- Build Max Heap
- Swap root with last element
- Reduce heap size and heapify again
*/

class HeapSortSalaries {

    static void heapSort(int[] arr) {

        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Move max to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check left child
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Check right child
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If root is not largest
        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {50000, 70000, 40000, 60000, 80000};
        heapSort(salaries);

        for (int s : salaries)
            System.out.print(s + " ");
    }
}

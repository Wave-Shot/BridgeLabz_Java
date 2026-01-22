package sorting;

/*
Bubble Sort:
- Repeatedly compares adjacent elements
- Swaps them if they are in the wrong order
- Largest element "bubbles" to the end in each pass
*/

class BubbleSortStudentMarks {

    static void bubbleSort(int[] marks) {

        int n = marks.length;

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Flag to check if any swap happened in this pass
            boolean swapped = false;

            // Inner loop compares adjacent elements
            // After each pass, last i elements are already sorted
            for (int j = 0; j < n - 1 - i; j++) {

                // If current element is greater than next, swap them
                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true; // Swap occurred
                }
            }

            // If no swap happened, array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 88};
        bubbleSort(marks);

        for (int m : marks)
            System.out.print(m + " ");
    }
}

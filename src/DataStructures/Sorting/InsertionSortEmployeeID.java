package sorting;

/*
Insertion Sort:
- Divides array into sorted and unsorted parts
- Picks one element from unsorted part
- Inserts it into correct position in sorted part
*/

class InsertionSortEmployeeIDs {

    static void insertionSort(int[] ids) {

        // Start from second element (first is already sorted)
        for (int i = 1; i < ids.length; i++) {

            int key = ids[i];   // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] ids = {104, 102, 109, 101, 106};
        insertionSort(ids);

        for (int id : ids)
            System.out.print(id + " ");
    }
}

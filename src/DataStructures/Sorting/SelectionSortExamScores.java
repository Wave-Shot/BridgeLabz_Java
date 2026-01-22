package sorting;
/*
Selection Sort:
- Find minimum element in unsorted part
- Swap with first unsorted position
*/

class SelectionSortExamScores {

    static void selectionSort(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find index of minimum element
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with current position
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {65, 85, 72, 90, 60};
        selectionSort(scores);

        for (int s : scores)
            System.out.print(s + " ");
    }
}

package sorting;
/*
Counting Sort:
- Used when range of values is small
- No comparisons are made
*/

class CountingSortStudentAges {

    static void countingSort(int[] ages) {

        int min = 10;
        int max = 18;

        // Count array size = range
        int[] count = new int[max - min + 1];

        // Store frequency of each age
        for (int age : ages)
            count[age - min]++;

        int index = 0;

        // Rebuild sorted array
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 18, 11, 13};
        countingSort(ages);

        for (int a : ages)
            System.out.print(a + " ");
    }
}

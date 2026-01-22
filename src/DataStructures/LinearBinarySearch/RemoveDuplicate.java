package LinearBinarySearch;

import java.util.HashSet;

class RemoveDuplicates {
    public static void main(String[] args) {

        // Input string with duplicate characters
        String input = "programming";

        // StringBuilder to store result without duplicates
        StringBuilder sb = new StringBuilder();

        // HashSet to keep track of characters already seen
        HashSet<Character> set = new HashSet<>();

        // Convert string to character array and loop through it
        for (char ch : input.toCharArray()) {

            // Check if character is NOT already present
            if (!set.contains(ch)) {

                // Append unique character to StringBuilder
                sb.append(ch);

                // Add character to HashSet
                set.add(ch);
            }
        }

        // Print string without duplicate characters
        System.out.println(sb.toString());
    }
}

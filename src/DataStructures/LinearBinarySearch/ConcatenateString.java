package LinearBinarySearch;

class ConcatenateStrings {
    public static void main(String[] args) {

        // Array of strings to concatenate
        String[] words = {"Java", " ", "is", " ", "powerful"};

        // Create StringBuffer (thread-safe mutable string)
        StringBuffer buffer = new StringBuffer();

        // Loop through each string in array
        for (String word : words) {

            // Append each string to StringBuffer
            buffer.append(word);
        }

        // Convert StringBuffer to String and print
        System.out.println(buffer.toString());
    }
}

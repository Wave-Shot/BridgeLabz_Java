package LinearBinarySearch;

class ReverseString {
    public static void main(String[] args) {

        // Original input string
        String input = "hello";

        // Create a StringBuilder object (mutable string)
        StringBuilder sb = new StringBuilder();

        // Append the input string into StringBuilder
        sb.append(input);

        // Reverse the contents of StringBuilder
        sb.reverse();

        // Convert StringBuilder back to String
        String result = sb.toString();

        // Print the reversed string
        System.out.println(result);
    }
}

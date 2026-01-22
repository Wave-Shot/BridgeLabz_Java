package LinearBinarySearch;
class SearchSentence {
    static String search(String[] sentences, String word) {

        for (String sentence : sentences) {

            // Check if sentence contains word
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Java is powerful",
                "Python is easy",
                "I love programming"
        };

        System.out.println(search(sentences, "Java"));
    }
}

// Creating class AverageMarks
class AverageMarks {

    public static void main(String[] args) {

        // Student name
        String name = "Sam";

        // Subject marks
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Total marks calculation
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        // Average percentage calculation
        double averageMarks = totalMarks / 3.0;

        // Displaying output
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}

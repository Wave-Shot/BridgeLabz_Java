// Creating class PenDistribution
class PenDistribution {

    public static void main(String[] args) {

        // Total pens
        int totalPens = 14;

        // Number of students
        int numberOfStudents = 3;

        // Pens per student
        int pensPerStudent = totalPens / numberOfStudents;

        // Remaining pens
        int remainingPens = totalPens % numberOfStudents;

        // Displaying output
        System.out.println(
                "The Pen Per Student is " + pensPerStudent +
                        " and the remaining pen not distributed is " + remainingPens
        );
    }
}

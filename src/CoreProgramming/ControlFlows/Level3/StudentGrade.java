import java.util.Scanner;

// Class to calculate percentage and grade
class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A | Remark: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: B | Remark: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C | Remark: Good");
        } else if (average >= 40) {
            System.out.println("Grade: D | Remark: Pass");
        } else {
            System.out.println("Grade: F | Remark: Fail");
        }
    }
}

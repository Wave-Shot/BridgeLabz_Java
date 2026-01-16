import java.util.Scanner;

// Class to check voting eligibility
class StudentVoteChecker {

    // Method to determine voting eligibility
    public boolean canStudentVote(int age) {

        // Invalid age check
        if (age < 0) {
            return false;
        }

        // Voting age check
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }
    }
}

import java.util.Scanner;

// Class to check voting eligibility for 10 students
class VotingEligibilityArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Taking input for all students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}

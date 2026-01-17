/*
 * Problem Statement:
 * Write a Java program to check whether a given date
 * falls in the Spring Season. The program should take
 * month and day as command-line arguments and display
 * the appropriate result.
 */

/*
 * Class Name: SpringSeason
 *
 * Description:
 * This class checks whether a given date falls within
 * the Spring season based on month and day values
 * provided through command-line arguments.
 */

// Class to check Spring Season
class SpringSeason {

    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking spring season range
        boolean isSpring =
                (month == 3 && day >= 20) ||
                        (month == 4 || month == 5) ||
                        (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

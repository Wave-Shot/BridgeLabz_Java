import java.util.Scanner;

// Class to check leap year using multiple if-else conditions
class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading year from user
        int year = input.nextInt();

        // Leap year works only for Gregorian calendar
        if (year >= 1582) {

            // If year divisible by 400, it is a leap year
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");

                // If year divisible by 100 but not 400, not a leap year
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");

                // If year divisible by 4, leap year
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");

                // Otherwise not a leap year
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Year should be 1582 or later");
        }
    }
}

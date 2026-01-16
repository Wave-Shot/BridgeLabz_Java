// Class to check whether a given date falls in Spring Season
class SpringSeason {

    // Method to check Spring Season
    // Spring: March 20 to June 20
    // Returns true if spring season, otherwise false
    public static boolean isSpringSeason(int month, int day) {

        // Check all valid spring date conditions
        return (month == 3 && day >= 20) ||
                (month == 4 || month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        // Reading command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Calling method and checking result
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}

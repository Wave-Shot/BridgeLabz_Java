import java.util.Scanner;

// Class to simulate Rock-Paper-Scissors game
class RockPaperScissors {

    // Method to generate computer choice
    public static String computerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    /*
     * Method to decide winner
     */
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) return "Draw";

        if (user.equals("Rock") && computer.equals("Scissors")) return "User";
        if (user.equals("Paper") && computer.equals("Rock")) return "User";
        if (user.equals("Scissors") && computer.equals("Paper")) return "User";

        return "Computer";
    }

    /*
     * Method to calculate win statistics
     */
    public static String[][] calculateStats(int userWins, int computerWins, int games) {

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / games);

        return stats;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int games = input.nextInt();
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            String userChoice = input.next();
            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;

            System.out.println("User: " + userChoice + " Computer: " + compChoice + " Winner: " + winner);
        }

        String[][] stats = calculateStats(userWins, computerWins, games);

        System.out.println("\nPlayer\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}

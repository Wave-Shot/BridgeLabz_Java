import java.util.Scanner;

// Class for rocket countdown
class RocketCountdownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}

import java.util.Scanner;

// Class to find youngest and tallest friend
class YoungestAndTallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading ages
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        // Reading heights
        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        // Finding youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Finding tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}

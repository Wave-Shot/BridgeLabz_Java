import java.util.Scanner;

// Class to distribute chocolates among children
class ChocolateDistribution {

    // Method returns:
    // index 0 → chocolates per child
    // index 1 → remaining chocolates
    public static int[] findRemainderAndQuotient(int chocolates, int children) {

        int perChild = chocolates / children;
        int remaining = chocolates % children;

        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Reading total chocolates and number of children
        int chocolates = input.nextInt();
        int children = input.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(chocolates, children);

        // Displaying result
        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates " + result[1]);
    }
}

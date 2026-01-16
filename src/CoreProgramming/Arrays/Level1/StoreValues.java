import java.util.Scanner;

// Class to store numbers and calculate sum
class StoreValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop
        while (true) {

            double value = input.nextDouble();

            // Stop if value is 0 or negative
            if (value <= 0 || index == 10) {
                break;
            }

            values[index] = value;
            index++;
        }

        // Calculating sum
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Total is " + total);
    }
}

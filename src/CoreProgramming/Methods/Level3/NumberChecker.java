// Utility class for digit-based number analysis
class NumberChecker {

    /*
     * Method to count digits in a number.
     * Converts number to String and checks length.
     */
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    /*
     * Method to extract digits of a number into an array.
     * Digits are stored in correct order.
     */
    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        // Fill array from last index to first
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    /*
     * Duck number check.
     * A duck number has at least one non-zero digit.
     */
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * Armstrong number check.
     * Sum of digits^number_of_digits == original number
     */
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    /*
     * Finds largest and second largest digits.
     * Integer.MIN_VALUE ensures correct comparison.
     */
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    /*
     * Finds smallest and second smallest digits.
     * Integer.MAX_VALUE ensures correct comparison.
     */
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        int number = 153;

        int[] digits = getDigits(number);

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}

import java.util.Random;

// Class to generate and validate OTPs
class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    /*
     * Method to check uniqueness of OTPs.
     * If any OTP repeats, return false.
     */
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("All OTPs unique: " + areOTPsUnique(otps));
    }
}

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {

    public static void main(String[] args) {

        String filePath = "users.csv";

        // Email Regex
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean validEmail = emailPattern.matcher(email).matches();
                boolean validPhone = phone.matches("\\d{10}");

                if (!validEmail || !validPhone) {
                    System.out.println("Invalid Row: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

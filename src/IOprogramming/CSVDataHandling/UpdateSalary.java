import java.io.*;

public class UpdateSalary {

    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            // Write header
            line = br.readLine();
            bw.write(line);
            bw.newLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {

                    double salary = Double.parseDouble(data[3]);
                    salary = salary * 1.10; // increase by 10%
                    data[3] = String.valueOf((int) salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            System.out.println("Updated file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

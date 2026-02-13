import java.io.*;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            bw.write("ID,Name,Department,Salary");
            bw.newLine();
            bw.write("1,Amit,IT,50000");
            bw.newLine();
            bw.write("2,Priya,HR,45000");
            bw.newLine();
            bw.write("3,Rohan,Finance,60000");
            bw.newLine();
            bw.write("4,Neha,Marketing,48000");
            bw.newLine();
            bw.write("5,Karan,Sales,52000");

            System.out.println("Employee CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

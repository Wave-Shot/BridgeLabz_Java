import java.io.*;
import java.util.*;

public class SortEmployees {

    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<String[]> employeeList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                employeeList.add(line.split(","));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort by salary descending
        employeeList.sort((a, b) ->
                Integer.parseInt(b[3]) - Integer.parseInt(a[3])
        );

        System.out.println("Top 5 Highest Paid Employees:");

        for (int i = 0; i < Math.min(5, employeeList.size()); i++) {

            String[] emp = employeeList.get(i);

            System.out.println("Name: " + emp[1] +
                    ", Department: " + emp[2] +
                    ", Salary: " + emp[3]);
        }
    }
}

import java.io.*;
import java.util.*;

public class CSVToObject {

    public static void main(String[] args) {

        String filePath = "students.csv";
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                // Create Student object
                Student student = new Student(id, name, age, marks);

                // Add to List
                studentList.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print all Student objects
        System.out.println("Student Objects:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}

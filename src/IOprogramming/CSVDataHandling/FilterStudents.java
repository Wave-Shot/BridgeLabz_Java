import java.io.*;

public class FilterStudents {

    public static void main(String[] args) {

        String filePath = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            System.out.println("Students scoring more than 80:");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println("ID: " + data[0] +
                            ", Name: " + data[1] +
                            ", Marks: " + marks);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.sql.*;
import java.io.*;

public class DBToCSV {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
        );

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

        BufferedWriter bw = new BufferedWriter(new FileWriter("report.csv"));
        bw.write("Employee ID,Name,Department,Salary");
        bw.newLine();

        while (rs.next()) {
            bw.write(rs.getInt("id") + "," +
                    rs.getString("name") + "," +
                    rs.getString("department") + "," +
                    rs.getDouble("salary"));
            bw.newLine();
        }

        bw.close();
        con.close();

        System.out.println("CSV Report Generated!");
    }
}

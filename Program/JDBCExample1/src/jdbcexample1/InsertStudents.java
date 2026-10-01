package jdbcexample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudents {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "1636";

        String sql = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";

        try {

            Connection con =
                DriverManager.getConnection(url, username, password);

            PreparedStatement pstmt = con.prepareStatement(sql);

            // Record 1
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Rahul");
            pstmt.setString(3, "Bangalore");
            pstmt.executeUpdate();

            // Record 2
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Anu");
            pstmt.setString(3, "Chennai");
            pstmt.executeUpdate();

            // Record 3
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Arjun");
            pstmt.setString(3, "Mumbai");
            pstmt.executeUpdate();

            // Record 4
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Priya");
            pstmt.setString(3, "Hyderabad");
            pstmt.executeUpdate();

            // Record 5
            pstmt.setInt(1, 5);
            pstmt.setString(2, "Vijay");
            pstmt.setString(3, "Delhi");
            pstmt.executeUpdate();

            System.out.println("5 student records inserted successfully!");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
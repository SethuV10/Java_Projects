package jd;

import java.sql.*;

public class StudentDatabase {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "your_password"; // your MySQL password

    public static void insertStudent(Student s) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO students (id, name, courses, balance) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, s.getStudentId());
            stmt.setString(2, s.getName());
            stmt.setString(3, s.getCoursesAsString());
            stmt.setInt(4, s.getBalance());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Student saved to database successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error saving student to database.");
            e.printStackTrace();
        }
    }
}

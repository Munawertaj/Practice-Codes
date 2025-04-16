package org.jdbc;

import java.sql.*;

public class StudentDAO {
    public void addStudent(String name, int age, String email, String course) {
        String query = "INSERT INTO student (name, age, email, course) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, email);
            pstmt.setString(4, course);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " student(s) added.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllStudents() {
        String query = "SELECT * FROM student";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("ID | Name | Age | Email | Course");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("course"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudentAge(int id, int age) {
        String query = "UPDATE student SET age = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, age);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " student(s) updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM student WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " student(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
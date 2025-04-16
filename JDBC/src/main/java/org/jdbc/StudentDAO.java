package org.jdbc;

import java.sql.*;
import java.util.Scanner;

public class StudentDAO {

    public void addStudent() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String name = "Nayem";
            int age = 24;
            String email = "nayem@gmail.com";
            String course = "BSc in EEE";

            String query = "INSERT INTO student (name, age, email, course) VALUES ('" +
                    name + "', " + age + ", '" + email + "', '" + course + "')";

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " student(s) added.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAllStudents() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

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

    public void updateStudent() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int id = 22;
            String name = "Nayem";
            int age = 25;
            String email = "nayem@gmail.com";
            String course = "BSc in EEE";

            String query = "UPDATE student SET age='" + age + "' WHERE id=" + id;

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " student(s) updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent() {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            int id = 23;

            String query = "DELETE FROM student WHERE id = " + id;

            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " student(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


package org.jdbc;

import java.sql.*;

public class MSSQLConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "bs1810";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();) {

            System.out.println("✅ Connected to MSSQL successfully!");

            String query = "select * from student";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");
                System.out.println("id: " + id + ", name: " + name + ", age: " + age + ", course: " + course);
            }

        } catch (SQLException e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
        }
    }
}

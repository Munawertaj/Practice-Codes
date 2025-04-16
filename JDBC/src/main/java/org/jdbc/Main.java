package org.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

//        dao.addStudent("Fahim", 28, "fahim@gmail.com", "BSc in EEE");
//        dao.updateStudentAge(25, 30);
//        dao.deleteStudent(27);
        dao.viewAllStudents();
    }
}

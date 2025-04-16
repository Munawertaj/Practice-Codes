package org.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

//        dao.addStudent("Nayem", 28, "nayem@gmail.com", "BSc in EEE");
//        dao.updateStudentAge(25, 25);
//        dao.deleteStudent(20);
        dao.viewAllStudents();
    }
}

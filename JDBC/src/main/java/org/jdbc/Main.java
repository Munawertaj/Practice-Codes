package org.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

//        dao.addStudent();
//        dao.updateStudent();
//        dao.deleteStudent();
        dao.viewAllStudents();
    }
}

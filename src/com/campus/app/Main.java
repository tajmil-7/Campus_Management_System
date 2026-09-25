package com.campus.app;
import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.println("Enter Student id: ");
        int studentid = sc.nextInt();
        System.out.println("Enter Student name: ");
        String studentname = sc.next();
        System.out.println("Enter Student age: ");
        int studentage = sc.nextInt();
        System.out.println("Enter Department: ");
        String department = sc.next();
        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks for " + n + " subjects: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        Student student = new Student(studentid, studentname, studentage, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}


package com.campus.service;
import com.campus.model.Student;

public class StudentService {
    //calculate Total
    public int calculateTotal(Student student){
        if (student.getMarks() == null) {
            return 0; // Return 0 if marks array is null or empty
        }
        int total = 0;
        for(int mark : student.getMarks()){
            total += mark;
        }
        return total;
    }
    //calculate Average
    public double calculateAverage(Student student){
        if (student.getMarks() == null) {            
            return 0.0; // Return 0.0 if marks array is null or empty
        }
        int total = calculateTotal(student);
        return (double) total / student.getMarks().length;
    }
    public int findMax(Student student){
        if (student.getMarks() == null) {            
            return 0;
        }
        int max = student.getMarks()[0];
        for(int mark : student.getMarks()){
            if(mark > max){
                max = mark;
            }
        }
        return max;
    }
    public int findMin(Student student){
        if (student.getMarks() == null) {            
            return 0;
        }
        int min = student.getMarks()[0];
        for(int mark : student.getMarks()){
            if(mark < min){
                min = mark;
            }
        }
        return min;
    }
    public char grade(Student student){
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F'; // Return 'F' if marks array is null or empty
        }
        double average = calculateAverage(student);
        if(average >= 90){
            return 'A';
        } else if(average >= 80){
            return 'B';
        } else if(average >= 70){
            return 'C';
        } else if(average >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    //pass or fail
    public String passOrFail(Student student){
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail"; // Return "Fail" if marks array is null or empty
        }
        int average = (int) calculateAverage(student);
           if(average >= 40){
               return "pass";
           }
           else{
               return "Fail";
           }
    }
    //display report card
    public void displayReportCard(Student student){
        System.out.println("Student Name: " + student.getStudentname());
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculateTotal(student));
        System.out.println("Average Marks: " + calculateAverage(student));
        System.out.println("Maximum Marks: " + findMax(student));
        System.out.println("Minimum Marks: " + findMin(student));
        System.out.println("Grade: " + grade(student));
        System.out.println("Result: " + passOrFail(student));
    }
}




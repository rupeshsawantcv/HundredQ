package com.Try;

class Student {
    private String studentName;
    private int studentID;
    private double marks;

    // Constructor
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    // Getter for student info
    public String getStudentInfo() {
        return "Student Name: " + studentName + ", Student ID: " + studentID;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(double marks) {
        if (marks > 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks set successfully: " + marks);
        } else {
            System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating a Student object
        Student std = new Student("Rupesh", 1);
        
        // Setting and getting marks
        std.setMarks(100);
        System.out.println(std.getStudentInfo());
        System.out.println("Student Marks: " + std.getMarks());
        
        // Testing invalid marks input
        std.setMarks(101);
    }
}

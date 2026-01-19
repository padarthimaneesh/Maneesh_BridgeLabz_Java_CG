package objectorientedprogramming.classandobject.level2;
/*
Program to Simulate Student Report
Problem Statement:
Create a Student class with attributes name, rollNumber, and marks.
Add methods to calculate grade and display details.
*/

class StudentDetails {
    private String name;
    private int rollNumber;
    private int marks;

    public StudentDetails(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else return 'D';
    }

    public void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Student {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails("Ananya", 12, 85);
        student.displayReport();
    }
}
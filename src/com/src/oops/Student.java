package com.src.oops;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}
public class Student {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.sname = "Unknown";
        this.course = "Unknown";
        this.attendance_percentage = 0.0;
        this.score = 0.0;
    }

    // Parameterized constructor
    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public String calculateGrade() throws LowAttendanceException{
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60%! Student: " + sname);
        }
        if (score >= 90) return "A+";
        else if (score >= 80) return "A";
        else if (score >= 70) return "B+";
        else if (score >= 60) return "B";
        else return "C";

    }

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", course='" + course + '\'' +
                ", attendance_percentage=" + attendance_percentage +
                ", score=" + score +
                '}';
    }
}

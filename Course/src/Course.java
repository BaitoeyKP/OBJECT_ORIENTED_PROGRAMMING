/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == this.students.length) {
            String[] temp = new String[this.students.length + 1];
            System.arraycopy(this.students, 0, temp, 0, this.students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i].equals(student)) {
                numberOfStudents--;
                if (i != numberOfStudents) {
                    students[i] = students[numberOfStudents];
                }
                this.students[numberOfStudents] = null;
                return 0;
            }
        }
        System.out.println("Error");
        return 0;
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}

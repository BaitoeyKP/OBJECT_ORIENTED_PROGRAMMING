/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("OOP");
        course.addStudent("Jim");
        course.addStudent("Yoon");
        course.addStudent("Tae");
        course.dropStudent("Yoon");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println("Student" + (i + 1) + " is " + course.getStudents()[i]);
        }
    }
}

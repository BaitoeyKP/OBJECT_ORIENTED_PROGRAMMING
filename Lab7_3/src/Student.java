/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Student extends Person {
    public static String freshmen = "Freshman";
    public static String sophomore = "Sophomore";
    public static String junior = "Junior";
    public static String senior = "Senior";
    private String status;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    public String toString() {
        return "Name : " + this.name + "\nAddress : " + this.address + "\nPhone Number : "
                + this.phoneNumber + "\nEmail : " + this.email + "\nStatus : " + this.status;
    }
}

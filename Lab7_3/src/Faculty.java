/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Faculty extends Employee {
    public static String lecturer = "Lecturer";
    public static String assistantProfessor = "Assistant Professor";
    public static String associateProfessor = "Associate Professor";
    public static String professor = "Professor";
    private String officeHours;
    private String rank;

    public Faculty(String name) {
        super(name);
    }

    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "Name : " + this.name + "\nAddress : " + this.address + "\nPhone Number : "
                + this.phoneNumber + "\nEmail : " + this.email + "\nOffice : " + this.office
                + "\nSalary : " + this.salary + "\nDate Hired : " + getDateHired() + "\nOffice Hours : "
                + this.officeHours + "\nRank : " + this.rank;
    }
}

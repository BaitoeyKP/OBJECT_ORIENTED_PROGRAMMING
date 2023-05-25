/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Staff extends Employee {
    private String title;

    public Staff(String name) {
        super(name);
    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Name : " + this.name + "\nAddress : " + this.address + "\nPhone Number : "
                + this.phoneNumber + "\nEmail : " + this.email + "\nOffice : " + this.office
                + "\nSalary : " + this.salary + "\nDate Hired : " + getDateHired() + "\nTitle : "
                + this.title;
    }
}

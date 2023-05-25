/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Employee extends Person {
    public double salary;
    public String office;
    public String dateHired;

    public Employee(String name) {
        super(name);
    }

    public Employee(String name, double salary, String office, String dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Name : " + this.name + "\nAddress : " + this.address + "\nPhone Number : "
                + this.phoneNumber + "\nEmail : " + this.email + "\nOffice : " + this.office
                + "\nSalary : " + this.salary + "\nDate Hired : " + getDateHired();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // no-arg
    Account() {
    }

    // specified id and innitial balance
    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    // accessor for id
    public int getId() {
        return id;
    }

    // mutator for id
    public void setId(int id) {
        this.id = id;
    }

    // accessor for balance
    public double getBalance() {
        return balance;
    }

    // mutator for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // accessor for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // mutator for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // accessor for dateCreated
    public Date getDateCreated() {
        java.util.Date dateCreated = new java.util.Date();
        return dateCreated;
    }

    // getMonthlyInterestRate
    double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    // getMonthylyInterest
    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // withdraw
    double withdraw(double amount) {
        return balance -= amount;
    }

    // deposit
    double deposit(double amount) {
        return balance += amount;
    }

    public String toString() {
        return "Account ID : " + this.id + "\nAnnual Interest Rate : " + this.annualInterestRate + " %"
                + "\nBalance : " + this.balance + "\nMonthly Interest : " + getMonthlyInterest() +
                "\nDate Created : " + getDateCreated();
    }
}

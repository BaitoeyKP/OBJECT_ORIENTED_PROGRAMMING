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
    private String mName;
    private int id;
    public double balance;
    private double annualInterestRate;
    public Date dateCreated;
    public double wBalance;
    public double dBalance;
    private double wAmount;
    private double dAmount;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        java.util.Date dateCreated = new java.util.Date();
        return dateCreated;
    }

    public void withdraw(double amount) {
        wBalance = balance - amount;
        this.wAmount = amount;
    }

    public void deposit(double amount) {
        dBalance = wBalance + amount;
        this.dAmount = amount;
    }

    public String toString() {
        return "Account ID : " + this.id + "\nAnnual Interest Rate : " + this.annualInterestRate + " %"
                + "\nBalance : " + this.balance + "\nWithdraw : " + wAmount + "\nBalance is " + wBalance +
                "\nDeposit : " + dAmount + "\nBalance is " + dBalance + "\nThis account was created at "
                + getDateCreated();
    }
}

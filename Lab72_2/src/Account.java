/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Date;
import java.util.ArrayList;

public class Account {
    private String name;
    private int id;
    public double balance;
    private double annualInterestRate;
    public Date dateCreated;
    public double wBalance;
    public double dBalance;
    private double wAmount;
    private double dAmount;
    private ArrayList<Transaction> transactions;

    public Account() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
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
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal from account"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

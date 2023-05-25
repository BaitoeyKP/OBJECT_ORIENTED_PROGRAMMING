/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class SavingsAccount extends Account {
    private double annualInterestRate;
    private double wAmount;
    private double dAmount;

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            super.withdraw(amount);
        }
        this.wAmount = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            super.deposit(amount);
        }
        this.dAmount = amount;
    }

    public String toString() {
        return "SavingsAccount" + "\nAnnual Interest Rate : " + this.annualInterestRate + " %" +
                "\nBalance is " + balance + "\nWithdraw : " + wAmount + "\nBalance is " + wBalance +
                "\nDeposit : " + dAmount + "\nBalance is " + dBalance + "\nThis account was created at "
                + getDateCreated();
    }
}

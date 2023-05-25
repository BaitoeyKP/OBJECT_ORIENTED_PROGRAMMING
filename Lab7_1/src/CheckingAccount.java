/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class CheckingAccount extends Account {
    private double overdraftLimit = 5000.00;
    private double amount;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit && amount > 0) {
            super.withdraw(amount);
        }
        this.amount = amount;
    }

    public String toString() {
        return "CheckingAccount\n" + "Overdraft Limit : " + overdraftLimit + "\nBalance is " + balance
                + "\nWithdraw : " + amount + "\nBalance is " + wBalance + "\nThis account was created at "
                + getDateCreated();
    }
}

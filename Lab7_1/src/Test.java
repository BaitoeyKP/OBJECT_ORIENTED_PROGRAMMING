/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account(212, 777);
        a1.withdraw(77);
        a1.deposit(7);
        a1.setAnnualInterestRate(2.0);
        System.out.println(a1.toString() + "\n\n");

        CheckingAccount c1 = new CheckingAccount(224, 888);
        c1.withdraw(5800);
        System.out.println(c1.toString() + "\n\n");

        SavingsAccount s1 = new SavingsAccount(236, 999);
        s1.withdraw(900);
        s1.deposit(100);
        s1.setAnnualInterestRate(1.5);
        System.out.println(s1.toString() + "\n\n");
    }
}

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
        Account a1 = new Account("JIMIN", 1310, 1995);
        a1.setAnnualInterestRate(2.0);
        a1.withdraw(78);
        a1.withdraw(27);
        a1.withdraw(28);
        a1.deposit(201);
        a1.deposit(6);
        a1.deposit(13);
        System.out.println("Name : " + a1.getName() + "\nAccount ID : " + a1.getId());
        System.out.println("Annual Interest Rate : " + a1.getAnnualInterestRate());
        System.out.println("Balance : " + a1.getBalance());
        System.out.println("Date                           Type     Amount  Balance     Discription");
        for (int i = 0; i < a1.getTransactions().size(); i++) {
            System.out.print((a1.getTransactions()).get(i).getDate() + "    ");
            System.out.print((a1.getTransactions()).get(i).getType() + "        ");
            System.out.print((a1.getTransactions()).get(i).getAmount() + "    ");
            System.out.print((a1.getTransactions()).get(i).getBalance() + "    ");
            System.out.println((a1.getTransactions()).get(i).getDescription());
        }
    }
}

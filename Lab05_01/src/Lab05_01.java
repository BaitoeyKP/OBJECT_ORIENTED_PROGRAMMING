/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Lab05_01 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println(account1.toString());
    }
}

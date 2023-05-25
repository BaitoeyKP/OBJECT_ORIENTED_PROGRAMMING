/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class TestTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("Day (1or2) : ");
        int day = input.nextInt();
        System.out.print("Zone (1-5): ");
        int zone = input.nextInt();
        System.out.print("Amount : ");
        int amount = input.nextInt();
        Ticket t1 = new Ticket(name, day, zone, amount);
        System.out.println(t1.toString());
        System.out.print("\nDay (1or2): ");
        int day2 = input.nextInt();
        System.out.print("Zone (1-5): ");
        int zone2 = input.nextInt();
        System.out.print("Amount : ");
        int amount2 = input.nextInt();
        Ticket t2 = new Ticket(day2, zone2, amount2);
        System.out.println(t2.toString());
    }
}

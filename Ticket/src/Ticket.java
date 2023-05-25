/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Ticket {
    private String name;
    private int day; // 1 or 2
    private static int zone; // 1 2 3 4 5
    private int amount;
    private double price;
    private static double zonePrice; // 8000 6000 5000 3500 2500

    public Ticket(String name, int day, int zone, int amount) {
        this.name = name;
        this.day = day;
        this.zone = zone;
        this.amount = amount;
    }

    public Ticket(int day, int zone, int amount) {
        this.day = day;
        this.zone = zone;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getZone() {
        return zone;
    }

    public int getAmount() {
        return amount;
    }

    public static double zonePrice() {
        double a = zonePrice;
        if (zone == 1) {
            zonePrice = 8000;
            a = zonePrice;
        } else if (zone == 2) {
            zonePrice = 6000;
            a = zonePrice;
        } else if (zone == 3) {
            zonePrice = 5000;
            a = zonePrice;
        } else if (zone == 4) {
            zonePrice = 3500;
            a = zonePrice;
        } else if (zone == 5) {
            zonePrice = 2500;
            a = zonePrice;
        }
        return a;
    }

    public double getPrice() {
        return zonePrice() * amount;
    }

    public String toString() {
        return "Price : " + getPrice();
    }
}

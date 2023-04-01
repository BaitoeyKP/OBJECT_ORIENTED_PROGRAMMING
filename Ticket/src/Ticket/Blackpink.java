/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author BAITOEY
 */
public class Blackpink extends Ticket {

    private int limit = 12;

    public Blackpink(String name, int day, char zone, int amount) throws IllegalArg {
        super(name, day, zone, amount);
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1 || amount > limit) {
            throw new IllegalArg(day, zone, amount);
        }
    }

    public Blackpink(int day, char zone, int amount) throws IllegalArg {
        super(day, zone, amount);
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1 || amount > limit) {
            throw new IllegalArg(day, zone, amount);
        }
    }

    public void result() {
        System.out.println("Blackpink CONCERT");
        super.result();
    }
}

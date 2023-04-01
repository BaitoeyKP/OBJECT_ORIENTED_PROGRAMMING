/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author BAITOEY
 */
public class BTS extends Ticket {

    private int limit = 7;

    public BTS(String name, int day, char zone, int amount) throws IllegalArg {
        super(name, day, zone, amount);
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1 || amount > limit) {
            throw new IllegalArg(day, zone, amount);
        }
    }

    public BTS(int day, char zone, int amount) throws IllegalArg {
        super(day, zone, amount);
        if (day < 1 || day > 2 || zone < 'A' || zone > 'G' || amount < 1 || amount > limit) {
            throw new IllegalArg(day, zone, amount);
        }
    }

    public void result() {
        System.out.println("BTS CONCERT");
        super.result();
    }
}

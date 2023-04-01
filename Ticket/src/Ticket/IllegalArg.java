/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

/**
 *
 * @author BAITOEY
 */
public class IllegalArg extends Exception {

    private int day; //1 or 2
    private char zone; //A B C D E F G
    private int amount;
    private String reason = "Please read the instruction again";
    private int limit;

    public IllegalArg(int day, char zone, int amount) {
        this.day = day;
        this.zone = zone;
        this.amount = amount;
    }

    public String getReason() {
        if (day < 1 || day > 2) {
            reason = "Please choose day 1 or 2";
        } else if (zone < 'A' || zone > 'G') {
            reason = "Please choose zone A-G";
        } else if (amount < 1 || amount > limit) {
            reason = "You cannot buy out of the limit";
        }
        return reason;
    }

    public String toString() {
        return getReason();
    }
}

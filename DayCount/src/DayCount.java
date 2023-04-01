/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class DayCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int Now = input.nextInt();
        System.out.print("Enter the number of days elcapsed since today : ");
        int Next = input.nextInt();
        String Today = "Day";
        String FutureDay = "Day";
        int Future = Now + (Next % 7);
        switch (Now) {
            case 0:
                Today = "Sunday";
                break;
            case 1:
                Today = "Monday";
                break;
            case 2:
                Today = "Tueday";
                break;
            case 3:
                Today = "Wednesday";
                break;
            case 4:
                Today = "Thursday";
                break;
            case 5:
                Today = "Friday";
                break;
            case 6:
                Today = "Saturday";
                break;
        }
        switch (Future) {
            case 0:
                FutureDay = "Sunday";
                break;
            case 1:
                FutureDay = "Monday";
                break;
            case 2:
                FutureDay = "Tueday";
                break;
            case 3:
                FutureDay = "Wednesday";
                break;
            case 4:
                FutureDay = "Thursday";
                break;
            case 5:
                FutureDay = "Friday";
                break;
            case 6:
                FutureDay = "Saturday";
                break;
        }
        if (Now < 0 || Now > 6) {
            System.out.println("ERROR");
        } else {
            System.out.println("Today is " + Today + " and the future day is " + FutureDay);
        }
    }
}

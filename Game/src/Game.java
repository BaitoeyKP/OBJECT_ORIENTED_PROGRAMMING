/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int Com = (int) (Math.random() * 3);
        System.out.print("scissor(0), rock(1), paper(2) : ");
        Scanner input = new Scanner(System.in);
        int Play = input.nextInt();
        String Computer = " ";
        String Player = " ";
        int Result = 0;
        String FinalResult = " ";
        switch (Com) {
            case 0:
                Computer = "scissor";
                break;
            case 1:
                Computer = "rock";
                break;
            case 2:
                Computer = "paper";
                break;
        }
        switch (Play) {
            case 0:
                Player = "scissor";
                break;
            case 1:
                Player = "rock";
                break;
            case 2:
                Player = "paper";
                break;
        }
        if ((Com == 0 && Play == 0) || (Com == 1 && Play == 1) || (Com == 2 && Play == 2)) {
            Result = 0; // draw
        } else if ((Com == 0 && Play == 1) || (Com == 1 && Play == 2) || (Com == 2 && Play == 0)) {
            Result = 1; // win
        } else if ((Com == 0 && Play == 2) || (Com == 1 && Play == 0) || (Com == 2 && Play == 1)) {
            Result = 2; // lose
        }
        switch (Result) {
            case 0:
                FinalResult = "It is a draw";
                break;
            case 1:
                FinalResult = "You won";
                break;
            case 2:
                FinalResult = "You lost";
                break;
        }
        if (Play < 0 || Play > 2) {
            System.out.println("ERROR");
        } else {
            System.out.println("The computer is " + Computer + ". You are " + Player + ". " + FinalResult);
        }
    }
}

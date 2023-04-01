/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int Number = input.nextInt();
        if (Number > 0 && Number < 1000) {
            int First = Number % 10;
            Number /= 10;
            int Second = Number % 10;
            Number /= 10;
            int Sum = First + Second + Number;
            System.out.println("The sum of the digits is " + Sum);
        } else {
            System.out.println("ERROR!!!\nPlease enter a number between 0 and 1000");
        }
    }
}

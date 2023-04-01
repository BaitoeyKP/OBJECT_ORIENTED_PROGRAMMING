/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int Pyramid = input.nextInt();
        if ((Pyramid < 1) || (Pyramid > 15)) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < Pyramid; i++) {
                System.out.print(" ".repeat(Pyramid - 1 - i));
                for (int j = i; j >= -i; j--) {
                    System.out.print((Math.abs(j) + 1) + "");
                }
                System.out.println();
            }
        }
    }
}

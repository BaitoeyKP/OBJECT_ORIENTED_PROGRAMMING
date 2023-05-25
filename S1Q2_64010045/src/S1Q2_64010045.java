/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class S1Q2_64010045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] a = { { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" },
                { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" } };
        System.out.print("Random characters are : ");
        int b = (int) (Math.random() * 2);
        for (int i = 0; i < 10; i++) {
            int c = (int) (Math.random() * 10);
            while (a[b][c] == "X") {
                c = (int) (Math.random() * 10);
            }
            System.out.print(a[b][c] + " ");
            a[b][c] = "X";
            b++;
            b %= 2;
        }
        System.out.println("");
        System.out.print("Select group of characters [1] characters or [2] numberic : ");
        int group = input.nextInt();
        switch (group) {
            case 1:
                System.out.print("Characters not in the list are: ");
                for (int i = 0; i < 10; i++) {
                    if (a[0][i] != "X") {
                        System.out.print(a[0][i] + " ");
                    }
                }
                break;
            case 2:
                System.out.print("Characters not in the list are: ");
                for (int i = 0; i < 10; i++) {
                    if (a[1][i] != "X") {
                        System.out.print(a[1][i] + " ");
                    }
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

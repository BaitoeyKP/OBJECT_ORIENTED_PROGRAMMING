/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Arrays;
import java.util.Scanner;

public class S1Q1_64010045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of matrix : ");
        int size = input.nextInt();
        if (size >= 4) {
            int[][] m = new int[size][size];
            System.out.println("Random matrix is :");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    m[i][j] = (int) (Math.random() * 10);
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
            System.out.print("Please input value of Row and Column : ");
            int row = input.nextInt();
            int column = input.nextInt();
            System.out.println("The selected member is " + m[row][column]);
            System.out.print("(i) Members on top : ");
            if (row == 0) {
                System.out.print("NO");
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(m[i][column] + " ");
                }
            }
            System.out.println("");
            System.out.print("(ii) Members on the Right Hand Side : ");
            if (column == size - 1) {
                System.out.print("NO");
            } else {
                for (int j = column + 1; j < size; j++) {
                    System.out.print(m[row][j] + " ");
                }
            }
            System.out.println("");
            System.out.print("(iii) Members on the Bottom : ");
            if (row == size - 1) {
                System.out.print("NO");
            } else {
                for (int k = row + 1; k < size; k++) {
                    System.out.print(m[k][column] + " ");
                }
            }
            System.out.println("");
            System.out.print("(iv) Members on the Left Hand Side : ");
            if (column == 0) {
                System.out.print("NO");
            } else {
                for (int l = column - 1; l >= 0; l--) {
                    System.out.print(m[row][l] + " ");
                }
            }
            System.out.println("");
        } else {
            System.out.println("ERROR");
        }
    }
}

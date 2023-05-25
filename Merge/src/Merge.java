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

public class Merge {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter list 1 : ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list 2 : ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        System.out.print("The merged list is ");
        for (int i : merge(list1, list2)) {
            System.out.print(i + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, list3, 0, list1.length);
        System.arraycopy(list2, 0, list3, list1.length, list2.length);
        Arrays.sort(list3);
        return list3;
    }
}
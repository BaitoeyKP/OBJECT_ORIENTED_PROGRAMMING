/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 3 sides of the triangle : ");
        double[] side = new double[3];
        for (int i = 0; i < side.length; i++) {
            side[i] = input.nextDouble();
        }
        System.out.print("The color is : ");
        String color = input.next();
        System.out.print("The triangle is filled (true or false) : ");
        boolean fill = input.nextBoolean();
        System.out.println("-------------------------------------------------------");
        Triangle t1 = new Triangle(side[0], side[1], side[2], color, fill);
        if (side[0] > 0 && side[1] > 0 && side[2] > 0) {
            System.out.println(t1.toString());
        } else {
            System.out.println("side cannot be negative");
        }
    }
}

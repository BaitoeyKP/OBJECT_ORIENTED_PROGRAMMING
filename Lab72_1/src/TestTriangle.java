/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter color : ");
        String color = input.nextLine();
        System.out.print("Fill the color (true or false) : ");
        boolean fill = input.nextBoolean();
        System.out.print("Enter side1 : ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 : ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 : ");
        double side3 = input.nextDouble();
        Triangle t1 = new Triangle(side1, side2, side3, color, fill);
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            System.out.println(t1.toString());
            if (fill == true) {
                System.out.println("color = " + color);
            }
        } else {
            System.out.println("side cannot be negative");
        }
    }

}

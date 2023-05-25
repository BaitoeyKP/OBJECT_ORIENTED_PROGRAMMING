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
        Object a = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose a number [Circle(1), Rectangle(2), Triangle(3)] : ");
        int type = input.nextInt();
        if (type == 1) {
            System.out.print("Enter radius : ");
            double radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("radius cannot be negative");
            } else {
                System.out.print("Enter color : ");
                String color = input.next();
                System.out.print("Fill the color (true or false) : ");
                boolean fill = input.nextBoolean();
                a = new Circle(radius, color, fill);
            }
        } else if (type == 2) {
            System.out.print("Enter width : ");
            double width = input.nextDouble();
            System.out.print("Enter length : ");
            double length = input.nextDouble();
            if (width < 0 || length < 0) {
                System.out.println("width and length cannot be negative");
            } else {
                System.out.print("Enter color : ");
                String color = input.next();
                System.out.print("Fill the color (true or false) : ");
                boolean fill = input.nextBoolean();
                a = new Rectangle(width, length, color, fill);
            }
        } else if (type == 3) {
            System.out.print("Enter side1 : ");
            double side1 = input.nextDouble();
            System.out.print("Enter side2 : ");
            double side2 = input.nextDouble();
            System.out.print("Enter side3 : ");
            double side3 = input.nextDouble();
            if (side1 < 0 || side2 < 0 || side3 < 0) {
                System.out.println("side cannot be negative");
            } else {
                System.out.print("Enter color : ");
                String color = input.next();
                System.out.print("Fill the color (true or false) : ");
                boolean fill = input.nextBoolean();
                a = new Triangle(side1, side2, side3, color, fill);
            }
        } else {
            System.out.println("Please choose 1-3");
        }
        System.out.println(a.toString());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name and age : ");
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.print("Weight (input format : 1 = kg 2 = pound value) : ");
        int formatW = input.nextInt();
        double w = input.nextDouble();
        System.out.print("Height (input format : 1 = meter 2 = feet-inch) : ");
        int formatH = input.nextInt();
        if (formatW == 1 && formatH == 1) {
            double h1 = input.nextDouble();
            BMI bmi1 = new BMI(name, age, w, h1);
            System.out.println(bmi1.toString());
        } else if (formatW == 2 && formatH == 1) {
            w = w * 0.45359237;
            double h1 = input.nextDouble();
            BMI bmi1 = new BMI(name, age, w, h1);
            System.out.println(bmi1.toString());
        } else if (formatW == 1 && formatH == 2) {
            double h1 = input.nextDouble();
            double h2 = input.nextDouble();
            BMI bmi1 = new BMI(name, age, w, h1, h2);
            System.out.println(bmi1.toString());
        } else if (formatW == 2 && formatH == 2) {
            double h1 = input.nextDouble();
            double h2 = input.nextDouble();
            w = w * 0.45359237;
            BMI bmi1 = new BMI(name, age, w, h1, h2);
            System.out.println(bmi1.toString());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double Weight = input.nextDouble();
        System.out.print("Enter height in inches : ");
        double Height = input.nextDouble();
        double W = Weight * 0.45359237;
        double H = Height * 0.0254;
        double BMI = (W / (H * H));
        System.out.println("BMI is " + BMI);
    }
}

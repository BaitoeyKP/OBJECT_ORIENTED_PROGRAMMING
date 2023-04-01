/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = input.nextDouble();
        System.out.print("Enter the value of d : ");
        double d = input.nextDouble();
        System.out.print("Enter the value of e : ");
        double e = input.nextDouble();
        System.out.print("Enter the value of f : ");
        double f = input.nextDouble();
        double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
        double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
        System.out.println("x = " + x + " and y = " + y);
    }
}

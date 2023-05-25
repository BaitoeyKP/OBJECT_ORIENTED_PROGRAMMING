
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Creating cicle 1, input radius : ");
        double r1 = input.nextDouble();
        Circle c1 = new Circle(r1);
        System.out.print("Creating cicle 2, input radius : ");
        double r2 = input.nextDouble();
        Circle c2 = new Circle(r2);
        switch (c1.compareTo(c2)) {
            case (1):
                System.out.println("The max circle's radius is " + r1);
                break;
            case (-1):
                System.out.println("The max circle's radius is " + r2);
                break;
            case (0):
                System.out.println("The circles are equal");
                break;
        }
        System.out.print("Creating rectangle 1, input width and height : ");
        double[] wh1 = new double[2];
        for (int i = 0; i < wh1.length; i++) {
            wh1[i] = input.nextDouble();
        }
        Rectangle rec1 = new Rectangle(wh1[0], wh1[1]);
        System.out.print("Creating rectangle 1, input width and height : ");
        double[] wh2 = new double[2];
        for (int i = 0; i < wh2.length; i++) {
            wh2[i] = input.nextDouble();
        }
        Rectangle rec2 = new Rectangle(wh2[0], wh2[1]);
        switch (rec1.compareTo(rec2)) {
            case (1):
                System.out.println("The max rectangle's width and height are " + rec1);
                break;
            case (-1):
                System.out.println("The max rectangle's width and height are " + rec2);
                break;
            case (0):
                System.out.println("The rectangles are equal");
                break;
        }
    }
}

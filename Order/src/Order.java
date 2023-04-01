/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city : ");
        String FirstCity = input.nextLine();
        System.out.print("Enter the second city : ");
        String SecondCity = input.nextLine();
        System.out.print("Enter the third city : ");
        String ThirdCity = input.nextLine();
        if ((FirstCity.compareToIgnoreCase(SecondCity) < 0) && (FirstCity.compareToIgnoreCase(ThirdCity) < 0)) {
            if (SecondCity.compareToIgnoreCase(ThirdCity) < 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + FirstCity + " " + SecondCity + " " + ThirdCity);
            } else if (SecondCity.compareToIgnoreCase(ThirdCity) > 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + FirstCity + " " + ThirdCity + " " + SecondCity);
            }
        } else if ((SecondCity.compareToIgnoreCase(FirstCity) < 0) && (SecondCity.compareToIgnoreCase(ThirdCity) < 0)) {
            if (ThirdCity.compareToIgnoreCase(FirstCity) < 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + SecondCity + " " + ThirdCity + " " + FirstCity);
            } else if (ThirdCity.compareToIgnoreCase(FirstCity) > 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + SecondCity + " " + FirstCity + " " + ThirdCity);
            }
        } else if ((ThirdCity.compareToIgnoreCase(FirstCity) < 0) && (ThirdCity.compareToIgnoreCase(SecondCity) < 0)) {
            if (SecondCity.compareToIgnoreCase(FirstCity) < 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + ThirdCity + " " + SecondCity + " " + FirstCity);
            } else if (SecondCity.compareToIgnoreCase(FirstCity) > 0) {
                System.out.println(
                        "The three cities in alphabetical order are " + ThirdCity + " " + FirstCity + " " + SecondCity);
            }
        }
    }
}

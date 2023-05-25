/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Lab05_02 {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        System.out.println(p1.toString());
        RegularPolygon p2 = new RegularPolygon(6, 4);
        System.out.println(p2.toString());
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(p3.toString());
    }
}

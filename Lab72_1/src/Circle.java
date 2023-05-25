/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Circle extends Geometric {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimater() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Area = " + getArea() + "\nPerimater = " + getPerimater();
    }
}

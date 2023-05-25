/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010054 KANYARAT PHOOKOSOT
 */
public class Circle extends GeometricObject {
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

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public String toString() {
        return "Area = " + getArea() + "\nPerimater = " + getPerimater() + "\nDiameter = " + getDiameter()
                + "\nColor = " + getColor() + "\nFill the color = " + isIsFilled();
    }

    private String getPerimater() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

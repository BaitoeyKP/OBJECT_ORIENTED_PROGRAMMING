/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Rectangle extends Geometric {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean isFilled) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimater() {
        return (2 * width) + (2 * length);
    }

    public String toString() {
        return "Width : " + width + " Length : " + length + "\nArea = " + getArea()
                + "\nPerimater = " + getPerimater() + "\nColor = " + getColor()
                + "\nFill the color = " + isIsFilled();
    }
}

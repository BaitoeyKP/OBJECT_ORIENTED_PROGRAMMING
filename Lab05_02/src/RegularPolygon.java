/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

import java.lang.Math;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    // no-arg
    RegularPolygon() {
        n = 3;
        side = 1;
    }

    // specified n, side and (x,y)=(0,0)
    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // specified n, side, x, y
    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }

    public String toString() {
        String result;
        if (this.n >= 3 && this.side > 0) {
            result = "Area : " + this.getArea() + "\nPerimeter : " + this.getPerimeter();
        } else if (this.n >= 3 && this.side <= 0) {
            result = "The side must be greater than zero.";
        } else if (this.n < 3 && this.side > 0) {
            result = "The number of edges must be greater than three.";
        } else {
            result = "The side must be greater than zero and the number of edges must be greater than three.";
        }
        return result;
    }
}

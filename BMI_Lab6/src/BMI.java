/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = (feet * 12 + inches) * METERS_PER_INCH;
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return Math.round(bmi * 100) / 100.0;
    }

    public String getInterpretation() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi < 25.0)
            return "Normal";
        else if (bmi >= 25.0 && bmi < 30.0)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Your BMI : " + getBMI() + "\nInterpretation : " + getInterpretation();
    }
}

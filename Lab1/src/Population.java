/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Population {
    public static void main(String[] args) {
        double Population = 312032486;
        double Time = 365 * 24 * 60 * 60;
        double Birth = Time / 7;
        double Death = Time / 13;
        double Immigrant = Time / 45;
        double NextYearPopulation1 = Population + Birth - Death + Immigrant;
        System.out.println("NextYearPopulation1 is " + NextYearPopulation1);
        double NextYearPopulation2 = NextYearPopulation1 + Birth - Death + Immigrant;
        System.out.println("NextYearPopulation2 is " + NextYearPopulation2);
        double NextYearPopulation3 = NextYearPopulation2 + Birth - Death + Immigrant;
        System.out.println("NextYearPopulation3 is " + NextYearPopulation3);
        double NextYearPopulation4 = NextYearPopulation3 + Birth - Death + Immigrant;
        System.out.println("NextYearPopulation4 is " + NextYearPopulation4);
        double NextYearPopulation5 = NextYearPopulation4 + Birth - Death + Immigrant;
        System.out.println("NextYearPopulation5 is " + NextYearPopulation5);
    }
}

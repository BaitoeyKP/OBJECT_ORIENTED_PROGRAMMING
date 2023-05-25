
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */
public class Program3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        Scanner input = new Scanner(file);
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        while (input.hasNext()) {
            String[] line = (input.nextLine()).split(" ");
            processData(assistant, associate, full, line[2], new Double(line[3]));
        }
        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);
        System.out.println("Total salary for assistant professor is "
                + (Math.round(totalAssistant * 100.0) / 100.0));
        System.out.println("Total salary for associate professor is "
                + (Math.round(totalAssociate * 100.0) / 100.0));
        System.out.println("Total salary for full professor is "
                + (Math.round(totalFull * 100.0) / 100.0));
        System.out.println("Total salary for all professors is "
                + (Math.round(totalFaculty * 100.0) / 100.0));
        System.out.println("-------------------------------------------------");
        System.out.println("Average salary for assistant professor is "
                + (Math.round((totalAssistant / assistant.size()) * 100.0) / 100.0));
        System.out.println("Average salary for associate professor is "
                + (Math.round((totalAssociate / associate.size()) * 100.0) / 100.0));
        System.out.println("Average salary for full professor is "
                + (Math.round((totalFull / full.size()) * 100.0) / 100.0));
        System.out.println("Average salary for all professors is "
                + (Math.round((totalFaculty / (assistant.size() + associate.size() + full.size()))
                        * 100.0) / 100.0));
    }

    public static void processData(ArrayList<Double> a, ArrayList<Double> b, ArrayList<Double> c, String rank,
            double salary) {
        switch (rank) {
            case "assistant":
                a.add(salary);
                break;
            case "associate":
                b.add(salary);
                break;
            case "full":
                c.add(salary);
                break;
        }
    }

    public static double getTotal(ArrayList<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }
}

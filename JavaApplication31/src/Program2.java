
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Program2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        PrintWriter out = new PrintWriter(file);
        String rank = " ";
        double salary = 0;
        for (int i = 1; i <= 1000; i++) {
            out.print("FirstName" + i);
            out.print(" LastName" + i);
            int rankRandom = (int) (Math.random() * 3);
            if (rankRandom == 0) {
                rank = "assistant";
                salary = (double) (Math.random() * 30001) + 50000;
            } else if (rankRandom == 1) {
                rank = "associate";
                salary = (double) (Math.random() * 50001) + 60000;
            } else if (rankRandom == 2) {
                rank = "full";
                salary = (double) (Math.random() * 55001) + 75000;
            }
            out.print(" " + rank);
            out.println(" " + (Math.round(salary * 100.0) / 100.0));
        }
        out.close();
    }
}

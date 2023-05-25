import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        boolean status = true;
        boolean choose = true;
        int concert = 0;
        while (status) {
            Scanner input = new Scanner(System.in);
            while (choose) {
                System.out.print("CONCERT TICKET\n1.BTS\t2.BLACKPINK\nCHOOSE A NUMBER : ");
                concert = input.nextInt();
                if (concert == 1) {
                    System.out.println("BTS CONCERT TICKET");
                    System.out.println("limit 7 tickets per person");
                    choose = false;
                } else if (concert == 2) {
                    System.out.println("BLACKPINK CONCERT TICKET");
                    System.out.println("limit 12 tickets per person");
                    choose = false;
                }
                System.out.println("Please choose the concert");
                System.out.println("------------------------------------------------");
            }
            System.out.print("Name : ");
            String name = input.next();
            System.out.print("Day (1 or 2) : ");
            int day = input.nextInt();
            System.out.print("Zone (A - G) : ");
            char zone = input.next().charAt(0);
            System.out.print("Amount : ");
            int amount = input.nextInt();
            System.out.println("------------------------------------------------");
            try {
                if (concert == 1) {
                    BTS b1 = new BTS(name, day, zone, amount);
                    b1.result();
                } else if (concert == 2) {
                    Blackpink p1 = new Blackpink(name, day, zone, amount);
                    p1.result();
                }
                System.out.println("CONGRATULATIONS");
                status = false;
            } catch (IllegalArg e) {
                System.out.println(e.toString());
                System.out.println("------------------------------------------------");
            }
        }
    }
}

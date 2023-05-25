/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 64010045 KANYARAT PHOOKOSOT
 */

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Jimin");
        p1.setAddress("HYBE Label, Seoul");
        p1.setPhoneNumber("0123456789");
        p1.setEmail("jimin@jinhit.com");
        System.out.println("Person");
        System.out.println(p1.toString() + "\n\n");

        Student s1 = new Student("JK", "Junior");
        s1.setAddress("HYBE Label, Seoul");
        s1.setPhoneNumber("0987654321");
        s1.setEmail("jk@jinhit.com");
        System.out.println("Student");
        System.out.println(s1.toString() + "\n\n");

        Employee e1 = new Employee("Jin", 1000000, "Jin Hit", "13 June 2013");
        e1.setAddress("HYBE Label, Seoul");
        e1.setPhoneNumber("0198763452");
        e1.setEmail("jin@jinhit.com");
        System.out.println(e1.toString() + "\n\n");

        Faculty f1 = new Faculty("V", "9-11AM", "Professor");
        f1.setAddress("HYBE Label, Seoul");
        f1.setPhoneNumber("0567894321");
        f1.setEmail("v@jinhit.com");
        f1.setOffice("Jin Hit");
        f1.setSalary(4578964);
        f1.setDateHired("13 June 2013");
        System.out.println(f1.toString() + "\n\n");

        Staff st1 = new Staff("SUGA", "Producer");
        st1.setAddress("HYBE Label, Seoul");
        st1.setPhoneNumber("0897645321");
        st1.setEmail("suga@jinhit.com");
        st1.setOffice("Jin Hit");
        st1.setSalary(4578964);
        st1.setDateHired("13 June 2013");
        System.out.println(st1.toString());
    }
}

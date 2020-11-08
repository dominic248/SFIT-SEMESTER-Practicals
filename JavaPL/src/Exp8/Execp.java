/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp8;
//8.2
import java.util.*;

/**
 *
 * @author Student
 */
public class Execp {

    public static void main(String[] args) {
        String name, centre, date;
        int seat_no;
        double m2 = 0, c2 = 0, p2 = 0, total, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Seat Number: ");
        centre = s.nextLine();
        System.out.print("Enter date of Examination: ");
        date = s.nextLine();
        try {
            System.out.print("Enter marks of Maths-2: ");
            m2 = s.nextDouble();
            System.out.print("Enter marks of Chemistry-2: ");
            c2 = s.nextDouble();
            System.out.print("Enter marks of Physics-2: ");
            p2 = s.nextDouble();
            if ((m2 < 0 || m2 > 100) || (c2 < 0 || c2 > 100) || (p2 < 0 || p2 > 100)) {
                throw new MarksOutOfBounds("Marks out of Bounds");
            } else {
                total = m2 + c2 + p2;
                percentage = (total / 240) * 100;
                System.out.println("Total: " + total + "\n" + "Percentage: " + percentage);
            }
        } catch (MarksOutOfBounds e) {
            System.out.println(e);
        }
    }
}

class MarksOutOfBounds extends Exception {

    String s;

    MarksOutOfBounds(String s) {
        super(s);
    }
}

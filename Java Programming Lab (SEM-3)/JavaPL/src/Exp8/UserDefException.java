/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp8;

/**
 *
 * @author dms
 */
import java.util.Scanner;
public class UserDefException {

    public static void main(String[] args) {
        String name, id;
        double bs, da, da1, hra, hra1, ta, ta1, tds, pf, gs, pt, ca;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = s.nextLine();
        System.out.print("Enter Employee Name: ");
        name = s.nextLine();
        try {
            System.out.print("Enter Basic Salary: ");
            bs = s.nextDouble();
            if (bs < 8000) {
                throw new PayOutOfBounds("Salary is less than 8000");
            } else {
                System.out.print("Enter Basic DA Of Employee: ");
                da = s.nextDouble();
                System.out.print("Enter Basic HRA Of Employee: ");
                hra = s.nextDouble();
                System.out.print("Enter Basic CA Of Employee: ");
                ca = s.nextDouble();
                System.out.print("Enter Basic TA Of Employee: ");
                ta = s.nextDouble();
                System.out.print("Enter Basic Professional Tax Of Employee: ");
                pt = s.nextDouble();
                System.out.print("Enter Basic TDS Of Employee: ");
                tds = s.nextDouble();
                System.out.print("Enter Basic PF Of Employee: ");
                pf = s.nextDouble();
                System.out.print("Enter Basic GS Of Employee: ");
                gs = s.nextDouble();
                da = (da * bs) / 100;
                hra = (hra * bs) / 100;
                ca = (ca * bs) / 100;
                ta = (ta * bs) / 100;
                pt = (pt * bs) / 100;
                tds = (tds * bs) / 100;
                pf = (pf * bs) / 100;
                gs = (gs * bs) / 100;
                System.out.println("Gross salary of "+name+" is :" + (bs + da + hra + ca + ta + pt + tds + pf + gs));
            }
        } catch (PayOutOfBounds e) {
            System.out.println(e);
        }
    }
}

class PayOutOfBounds extends Exception {

    PayOutOfBounds(String s) {
        super(s);
    }
}

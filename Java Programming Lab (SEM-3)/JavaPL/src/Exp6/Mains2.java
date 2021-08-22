package Exp6;

import java.util.Scanner;
class Employees {
    int emp_id;
    public String emp_name;
    Scanner sc = new Scanner(System.in);
    Employees() {
        System.out.print("Enter employee name: ");
        emp_name = sc.next();
        System.out.print("Enter employee id: ");
        emp_id = sc.nextInt();
    }
    void put() {
        System.out.println("Employee name: " + emp_name);
        System.out.println("Employee id: " + emp_id);
    }
}
class Salary extends Employees {
    double basic, hra, da, cla, gross;   
    Salary() {
        System.out.print("Enter basic pay: ");
        basic = sc.nextDouble();

        hra = 0.2 * basic;
        da = 0.4 * basic;

        System.out.print("Enter CLA: ");
        cla = sc.nextDouble();
    }
    void calcSalary() {
        gross = basic + hra + da + cla;
    }
    void displaySalary() {
        System.out.println("Gross salary: " + gross);
    }
}
public class Mains2 {
    public static void main(String args[]) {
        Salary s = new Salary();
        s.put();
        s.calcSalary();
        s.displaySalary();
    }
}

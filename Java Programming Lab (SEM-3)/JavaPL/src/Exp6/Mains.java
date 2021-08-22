package Exp6;

import java.util.Scanner; //import header
class Employee {
    int emp_no; //variables declaration
    String emp_name;
    Scanner sc = new Scanner(System.in); //Scanner class object creation
    void getemp() //method declaration for getting employee details
    {
        System.out.print("Enter employee number: ");
        emp_no = sc.nextInt(); //input employee number
        System.out.print("Enter employee name: ");
        emp_name = sc.next(); //input employee name
    }
}
class Fitness extends Employee //class Fitness is child class, with parent class as Employee
{
    double ht, wt; //variables declaration
    void getFitnessDetails() //method declaration for getting fitness details
    {
        System.out.print("Enter height of employee: ");
        ht = sc.nextDouble(); //input height
        System.out.print("Enter weight of employee: ");
        wt = sc.nextDouble(); //input weight
        System.out.println();
    }
    void displayDetails() //method to display employee details
    {
        System.out.println("Employee number: " + emp_no);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Height: " + ht);
        System.out.println("Weight: " + wt);
    }
}
public class Mains {
    public static void main(String args[]) //main method
    {
        Fitness f[] = new Fitness[5]; //creating array of objects for 5 employees
        int i;
        for (i = 0; i < 5; i++) {
            f[i] = new Fitness();
            f[i].getemp();
            f[i].getFitnessDetails();
        }
        for (i = 0; i < 5; i++) {
            f[i].displayDetails();
        }
    }
}

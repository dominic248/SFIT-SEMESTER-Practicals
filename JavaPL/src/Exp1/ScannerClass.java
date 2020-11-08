package Exp1;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String a[]) {
        String name;
        int age, rollno;
        float cgpa;
        Scanner s = new Scanner(System.in);
        System.out.print("Using Scanner Class\nEnter name: ");
        name = s.nextLine();
        System.out.print("Enter age: ");
        age = s.nextInt();
        System.out.print("Enter roll no: ");
        rollno = s.nextInt();
        System.out.print("Enter cgpa: ");
        cgpa = s.nextFloat();
        System.out.println("\nName=" + name + "\nAge=" + age + "\nRoll no=" + rollno + "\nCGPA=" + cgpa);
    }
}

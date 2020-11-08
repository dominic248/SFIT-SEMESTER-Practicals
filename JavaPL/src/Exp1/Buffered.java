package Exp1;

import java.io.BufferedReader;    //Import BufferedReader Header File
import java.io.IOException;       //Import IOException Header File 
import java.io.InputStreamReader; //Import Input Stream Reader Header File

public class Buffered {          //Start Class bufferedreader

    public static void main(String a[]) throws IOException //Start main method with IOException 
    {
        String name;
        float cgpa;
        int roll_no, age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Initialize Bufered  Reader 
        System.out.print("Using Buffer Reader\nEnter name: ");    //Print String Enter Name
        name = br.readLine();                 //Input Name
        System.out.print("Enter age: ");       //Print String Enter Age 
        age = Integer.parseInt(br.readLine());    //Input Age 
        System.out.print("Enter Roll No.: "); //Print String Enter Roll No
        roll_no = Integer.parseInt(br.readLine());    //Input Roll No
        System.out.print("Enter CGPA: ");     //Print String Enter CGPA
        cgpa = Float.parseFloat(br.readLine());   //Input CGPA
        System.out.println("\nName: " + name + "\nAge: " + age
                + "\nRoll no.: " + roll_no + "\nCGPA: " + cgpa);
    }						//End main method
}						//End of class

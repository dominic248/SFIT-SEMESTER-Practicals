/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp7;

/**
 *
 * @author dms
 */
import java.util.*;     //import package
interface Student {     //declaring a class
    int roll_no = 21;     //assigning int variable with value
    public void get();   //declaring a public void function
}
interface sports {       //declaring interface 
    double score = 97;    //assigning double variable score with value
}
class test implements Student //declaring class test that implements student
{
    Scanner sc = new Scanner(System.in);//declaring a new scanner object
    double marks;                       //declaring a double variable
    public void get() //defining void function
    {
        System.out.print("Enter the marks: ");//print"Enter the marks"
        marks = sc.nextDouble();          //taking user input for variable marks
    }
}
class results extends test implements sports //declaring class results that extends class test 
{
    double totalscore;				//declaring double variable totalscore
    void calc() //defining void function calc
    {
        System.out.println("Roll no is: " + roll_no);		//print the roll no entered by user
        System.out.println("Total score=" + (marks + score));	//print total of marks and score
    }
}
public class InheritanceExp {							//declaring public class ijk 
    public static void main(String[] args) {			//main function
        results r = new results();				//creating object of class result
        r.get();						//calling get function
        r.calc();						//calling calc function
    }
}

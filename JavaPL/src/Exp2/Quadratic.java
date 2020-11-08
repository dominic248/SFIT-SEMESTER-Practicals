/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp2;

import java.util.*;			//Import all header files

public class Quadratic {				//Start Class with name Roots

    public static void main(String[] args) {		//Start main method
        int a, b, c;						//Declare variables a ,b, c with its data type
        double x, y;						//Declare variable x, y with data type double 
        Scanner sc = new Scanner(System.in);			//Initialize new scanner
        System.out.print("Enter value of a: ");		//Print Enter value of a
        a = sc.nextInt();					//Input the value for a
        System.out.print("Enter value of b: ");		//Print Enter the value for b
        b = sc.nextInt();					//Input the value for b
        System.out.print("Enter value of c: ");		//Print Enter the value of c
        c = sc.nextInt();					//Input the value of c
        if (b * b - 4 * a * c < 0) //Start if loop with condition non real roots 
        {
            System.out.println("No real roots");		//Print No real roots 
        } else //Condition for Real roots
        {
            x = -b + Math.sqrt(b * b - 4 * a * c) / 2 * a;
            //Equation for calculating x root :Math.sqrt for calculating square root
            y = -b - Math.sqrt(b * b - 4 * a * c) / 2 * a;
            //Equation for calculating y root : Math.sqrt for calculating square root
            System.out.println("The roots of the equation are:" + x + "\t" + y);
            //Print the Real roots of equation
        }
    }
}

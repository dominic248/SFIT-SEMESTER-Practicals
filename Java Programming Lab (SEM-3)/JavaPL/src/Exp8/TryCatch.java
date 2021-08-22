/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp8;
//8.1
import java.io.*;

/**
 *
 * @author Student
 */
public class TryCatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2,n3,total;
        System.out.print("Enter value 1: ");
        n1=Integer.parseInt(br.readLine());
        System.out.print("Enter value 2: ");
        n2=Integer.parseInt(br.readLine());
        System.out.print("Enter value 3: ");
        n3=Integer.parseInt(br.readLine());
        int a[]=new int[]{1,2,3};
        try{
            try{
                total=(n1/n2)+n3;
                System.out.println("Division Result: "+total);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("Array out of bonds");
        }finally{
            System.out.println("EXIT!");
        }
        //Integer.parseInt(br.readLine()); 
    }
}

package Exp5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.*;
public class Occurance {
    public static void main(String[] args) {
        int n,i,x,count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=s.nextInt();
        }
        System.out.print("Enter element to find its total no. of occurance: ");
        x=s.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }else{
                continue;
            }
        }
        if(count!=0){
            System.out.println("Total no. of occurance "+x+" is: "+count);
        }else{
            System.out.println("The number is not found.");
        }
        
    }
}

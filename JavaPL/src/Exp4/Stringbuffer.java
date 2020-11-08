/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp4;

/**
 *
 * @author Student
 */
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Dominic");
        StringBuffer s2=new StringBuffer("sILVEIRA");
        StringBuffer s3=new StringBuffer();
        System.out.println("StringBuffer");
        System.out.println("Append s2 to s1: "+s1.append(s2));
        System.out.println("Insert string: "+s1.insert(2,"Hello"));
        System.out.println("Replace String: "+s1.replace(2, 4, "Hi"));
        System.out.println("Delete String: "+s1.delete(2, 5));
        System.out.println("Reverse String: "+s1.reverse());
        System.out.println("String Length: "+s1.length());
        System.out.println("Capacity with string: "+s1.capacity());
        System.out.println("Capacity without string: "+s3.capacity());
        System.out.println("String at position: "+s1.charAt(3));
        System.out.println("Substring: "+s1.substring(3));
        System.out.println("Substring from start to end: "+s1.substring(2,4));       
    }
}

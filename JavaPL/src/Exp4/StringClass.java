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
public class StringClass {
    public static void main(String[] args) {
        String s1="Dominic";
        String s2="sILVEIRA";
        System.out.println("String Class");
        System.out.println("Concatenation s2 to s1: "+s1.concat(s2));
        System.out.println("Using equals: "+s1.equals(s2));
        System.out.println("Using equalsIgnoreCase: "+s1.equalsIgnoreCase(s2));
        System.out.println("String Intern: "+s1.intern());
        System.out.println("String Length: "+s1.length());
        System.out.println("String to uppercase: "+s1.toUpperCase());
        System.out.println("String to lowercase: "+s1.toLowerCase());
        System.out.println("String at position: "+s1.charAt(3));
        System.out.println("Substring: "+s1.substring(3));
        System.out.println("Substring from start to end: "+s1.substring(2,4));
        System.out.println("String hashcode: "+s1.hashCode());
        System.out.println("Index of character: "+s1.indexOf("m"));
    }
}

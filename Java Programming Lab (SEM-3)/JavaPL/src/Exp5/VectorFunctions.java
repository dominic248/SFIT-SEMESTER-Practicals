/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp5;

/**
 *
 * @author dms
 */
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorFunctions {

    public static void main(String a[]) {
        Vector v = new Vector();  //vector object
        System.out.println("initial capacity of vector :" + v.capacity());
        v.add(1);           //adding values to vector
        v.add(2);
        v.add("mango");
        v.add("apple");
        v.add(3);
        v.add(5);
        System.out.println("modified capacity:" + v.size()); //display capacity
        System.out.println("first element:" + v.firstElement()); //display first element
        System.out.println("last element:" + v.lastElement());  //display last element
        if (v.contains(new String("mango"))) //syantax for contains
        {
            System.out.println("contains mango");
        } else {
            System.out.println("does not contains mango");
        }
        System.out.println("hash code:" + v.hashCode());
        if (v.isEmpty()) {
            System.out.println("vector is empty");
        } else {
            System.out.println("vector contains value");
        }
        v.insertElementAt(10, 2);  //inserting element
        System.out.println("modified vectopr is:" + v);
        v.removeElementAt(5);       //removing element
        System.out.println("modified vector is:" + v);
        System.out.println("sublist vector is:" + v.subList(1, 3)); //display sublist
        System.out.println("index is:" + v.indexOf("mango")); //display index
        v.setElementAt("RAHUL", 4);  //inserting 
        System.out.println("modified vector is:" + v);
        Vector<String> v1 = (Vector<String>) v.clone();   //cloning vector
        System.out.println("cloned string is:" + v1);
        v.clear();
        System.out.println("cleared string is:" + v);
        Enumeration e = v.elements();      //enumeration
        while (e.hasMoreElements()) {
            Object o = e.nextElement();
            System.out.println(o + " ");
        }
        v1.removeElement(3);
        System.out.println("vector after removal:" + v1);
        v.setSize(20);       //modifying size
        System.out.println("size of vector:" + v1.size());
        System.out.println("string equivalent of vector:" + v1.toString());
        v.ensureCapacity(25);
        System.out.println("minimum capacity :" + v1.capacity());
        v.trimToSize();      //trimmimg vector
        System.out.println("capacity after triming:" + v.capacity());
    }
}

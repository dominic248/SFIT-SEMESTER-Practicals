package Exp5;
import java.util.Vector;

public class VectorFunct {

    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("AB");
        v.add("CD");
        v.add("EF");
        v.add("GH");
        System.out.println("Vector is: " + v);
        v.insertElementAt("EF", 2);
        System.out.println("After inserting new element EF ,vector is: " + v);
        v.removeElementAt(2);
        System.out.println("After removing element at index 2,vector is: " + v);
        System.out.println("Hashcode of vector: " + v.hashCode());
        if (v.contains("FA")) {
            System.out.println("Vector contains element FA");
        } else {
            System.out.println("Vector does not contain element FA");
        }
        System.out.println("Last Index of AB: " + v.lastIndexOf("AB"));
        System.out.println("Sublist of vector from index 2 to 3: " + v.subList(2, 3));
        System.out.println("Index of element AB is: " + v.indexOf("AB"));
        System.out.println("First element of vector is: " + v.firstElement());
        System.out.println("Last element of vector is: " + v.lastElement());
        v.setElementAt("AF", 3);
        System.out.println("Vector after setting new element at index 3: " + v);

        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity of vector: " + v.capacity());
        v.ensureCapacity(12);
        System.out.println("Minimum ensured capacity: " + v.capacity());
        String s = v.get(2);
        System.out.println("Get element at position 2: " + s);
        v.clone();
        v.clear();
        if (v.isEmpty()) {
            System.out.println("Vector is empty");
        } else {
            System.out.println("Vector is not empty");
        }
    }
}

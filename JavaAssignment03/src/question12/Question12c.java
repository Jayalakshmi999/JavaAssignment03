package question12;

import java.util.ArrayList;
import java.util.Vector;

public class Question12c {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        // Printing the Vector and ArrayList
        System.out.println("Vector: " + vector);
        System.out.println("ArrayList: " + arrayList);
    }
}

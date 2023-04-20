package question15;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the Hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);

        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        // Printing the Hashtable and HashMap
        System.out.println("Hashtable: " + hashtable);
        System.out.println("HashMap: " + hashMap);
    }
}

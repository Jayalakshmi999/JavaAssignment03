package question16;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // add some key-value pairs
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // get the value associated with a key
        int value = map.get("banana");
        System.out.println("Value of key 'banana': " + value);

        // check if a key is present in the map
        boolean containsKey = map.containsKey("banana");
        System.out.println("Does the map contain 'banana'? " + containsKey);

        // remove a key-value pair from the map
        map.remove("orange");

        // iterate over the keys in the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store the key-value pairs
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add entries to the HashMap
        hashMap.put(5, "Rahul");
        hashMap.put(7, "Lakshman");
        hashMap.put(1, "Ram");
        hashMap.put(4, "Krrish");
        hashMap.put(2, "Lakshay");

        // Convert the HashMap to a TreeMap to sort by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(hashMap);

        // Print the sorted TreeMap
        System.out.println(sortedMap);
    }
}

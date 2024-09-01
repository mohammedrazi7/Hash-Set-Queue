import java.util.*;

public class SortedByValueExample {

    public static void main(String[] args) {
        // Create a HashMap to store the key-value pairs
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add entries to the HashMap
        hashMap.put(5, "Rahul");
        hashMap.put(7, "Lakshman");
        hashMap.put(1, "Ram");
        hashMap.put(4, "Krrish");
        hashMap.put(2, "Lakshay");

        // Convert the HashMap to a list of map entries
        List<Map.Entry<Integer, String>> list = new ArrayList<>(hashMap.entrySet());

        // Sort the list based on the values
        list.sort(Map.Entry.comparingByValue());

        // Create a LinkedHashMap to maintain the sorted order
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted LinkedHashMap
        System.out.println(sortedMap);
    }
}

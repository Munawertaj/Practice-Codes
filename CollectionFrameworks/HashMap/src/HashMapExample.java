import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Orange", 1);
        map.put("Apple", 3);
        map.put("Banana", 2);

        System.out.println(map);
        map.put("Banana", 1);
        System.out.println(map);

        // Retrieving values by key
        System.out.println("Apple count: " + map.get("Apple"));

        // Checking if a key exists
        System.out.println("Contains Apple? " + map.containsKey("Apple"));
        System.out.println("Contains Mango? " + map.containsKey("Mango"));

        // Removing an entry
        map.remove("Banana");
        System.out.println(map); // {Apple=3, Orange=5}

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, String> mp = new HashMap<>();
        mp.put(null, "NullValue");
        mp.put("Key1", null);

        System.out.println(mp); // {null=NullValue, Key1=null}
    }
}


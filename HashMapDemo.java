import java.util.*;

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        // insertion
        map.put("India", 120);
        map.put("USA", 20);
        map.put("China", 150);
        System.out.println(map);

        // searching
        // if (map.containsKey("China"))

        // {
        // System.out.println("key is present in the map");
        // } else {
        // System.out.println("key is not present in the map");
        // }

        System.out.println(map.get("China"));// keyexists
        System.out.println(map.get("chin"));// keydoes not exist

        int arr[] = { 12, 15, 18 };
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        for (int val : arr) {
            System.out.println(val + " ");
        }
        System.err.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) { // using entry set
            System.out.println(e.getKey() + " " + e.getValue());

        }
        System.out.println();

        Set<String> keys = map.keySet(); // using key set
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // remove pair
        map.remove("China");
        System.out.println(map);
    }
}
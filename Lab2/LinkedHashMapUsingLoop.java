package basic2;

import java.util.*;

public class LinkedHashMapUsingLoop {

    public static void main(String[] args) {

        // Arrays
        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        // Create LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Insert using for loop
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Display map
        System.out.println("LinkedHashMap: " + map);
    }
}
package basic2;

import java.util.*;

public class FirstLastKey {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();

        // Add elements (unordered input)
        treeMap.put("C2", "Red");
        treeMap.put("C1", "Green");
        treeMap.put("C4", "Black");
        treeMap.put("C3", "White");

        // Display TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Get first (lowest) key
        String firstKey = treeMap.firstKey();

        // Get last (highest) key
        String lastKey = treeMap.lastKey();

        // Display results
        System.out.println("First (lowest) key: " + firstKey);
        System.out.println("Last (highest) key: " + lastKey);
    }
}
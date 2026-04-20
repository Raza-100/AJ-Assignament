package basic2;

import java.util.*;

public class TreeMapIteration {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add elements
        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        // Display TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Iterate using entrySet()
        System.out.println("\nIterating over keys and values:");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               " -> Value: " + entry.getValue());
        }
    }
}
package basic2;

import java.util.*;

public class TreeMapClearAndAdd {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add initial elements
        treeMap.put(1, "Apple");
        treeMap.put(2, "Mango");
        treeMap.put(3, "Grapes");

        System.out.println("Original TreeMap: " + treeMap);

        // Clear all elements
        treeMap.clear();

        // Check size after clearing
        System.out.println("After clear(), size: " + treeMap.size());

        // Add new elements
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");
        treeMap.put(3, "Guava");
        treeMap.put(4, "Pomegranate");
        treeMap.put(5, "Amla");

        // Iterate elements
        System.out.println("\nAfter adding new elements:");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check size again
        System.out.println("Final size: " + treeMap.size());
    }
}
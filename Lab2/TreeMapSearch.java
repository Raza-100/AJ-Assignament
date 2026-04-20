package basic2;

import java.util.*;

public class TreeMapSearch {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();

        // Add elements
        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        // Display map
        System.out.println("TreeMap: " + treeMap);

        // Search for keys
        System.out.println("Contains key C4? " + treeMap.containsKey("C4"));
        System.out.println("Contains key C5? " + treeMap.containsKey("C5"));
    }
}
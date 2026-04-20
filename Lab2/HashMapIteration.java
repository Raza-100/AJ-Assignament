package basic2;

import java.util.*;

public class HashMapIteration {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Display map
        System.out.println("HashMap: " + map);

        // Iterate using entrySet()
        System.out.println("\nIterating over keys and values:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + 
                               " -> Value: " + entry.getValue());
        }
    }
}
package basic2;

import java.util.*;

public class LinkedHashMapIteration {

    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Display full map
        System.out.println("LinkedHashMap: " + map);

        // Iterate and display only first 4 elements
        System.out.println("\nFirst 4 inserted elements:");

        int count = 0;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (count == 4) break;

            System.out.println("Key: " + entry.getKey() +
                               " -> Value: " + entry.getValue());
            count++;
        }
    }
}
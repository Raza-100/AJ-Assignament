package basic2;

import java.util.*;

public class HashMapClearAndAdd {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add initial elements
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Grapes");

        System.out.println("Original Map: " + map);

        // Clear all elements
        map.clear();

        // Check size after clearing
        System.out.println("After clear(), size: " + map.size());

        // Add new elements
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Display new map
        System.out.println("After adding new elements: " + map);

        // Check size again
        System.out.println("New size: " + map.size());
    }
}
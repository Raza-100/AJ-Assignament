package basic2;

import java.util.*;

public class CopyHashMap {

    public static void main(String[] args) {

        // Create HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");

        // Create HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        // Display both maps
        System.out.println("HashMap1: " + map1);
        System.out.println("HashMap2 (before copy): " + map2);

        // Copy all mappings from map1 to map2
        map2.putAll(map1);

        // Display result
        System.out.println("HashMap2 (after copy): " + map2);
    }
}
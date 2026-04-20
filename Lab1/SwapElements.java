package basic;

import java.util.*;

public class SwapElements {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        // Display original list
        System.out.println("Original List: " + list);

        // Swap first (index 0) and third (index 2)
        Collections.swap(list, 0, 2);

        // Display updated list
        System.out.println("After swapping 1st and 3rd elements: " + list);
    }
}
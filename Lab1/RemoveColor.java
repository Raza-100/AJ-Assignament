package basic;

import java.util.*;

public class RemoveColor {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Remove "Blue" (by object)
        boolean removed = colors.remove("Blue");

        if (removed) {
            System.out.println("'Blue' removed successfully");
        } else {
            System.out.println("'Blue' not found");
        }

        // Final list
        System.out.println("Final List: " + colors);
    }
}
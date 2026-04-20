package basic;

import java.util.*;

public class SubListExample {

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

        // Extract 1st and 2nd elements
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted (1st & 2nd elements): " + subList);
    }
}
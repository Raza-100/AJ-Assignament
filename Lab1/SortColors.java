package basic;

import java.util.*;

public class SortColors {

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
        System.out.println("Before Sorting: " + colors);

        // Sort the list
        Collections.sort(colors);

        // Display sorted list
        System.out.println("After Sorting: " + colors);
    }
}
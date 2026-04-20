package basic;

import java.util.*;

public class DeleteNthElement {

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

        // Define n (example: 3rd element)
        int n = 3;

        // Remove nth element (index = n-1)
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("After removing " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position");
        }
    }
}
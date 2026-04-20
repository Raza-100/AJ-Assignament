package basic;

import java.util.*;

public class DisplayPosition {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        // Display elements with positions
        System.out.println("Elements with their positions:");

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + " : " + list.get(p));
        }
    }
}
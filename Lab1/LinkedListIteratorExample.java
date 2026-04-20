package basic;

import java.util.*;

public class LinkedListIteratorExample {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display full list
        System.out.println("Original List: " + list);

        // Create iterator starting from 2nd position (index = 1)
        ListIterator<String> iterator = list.listIterator(1);

        System.out.println("Iterating from 2nd element:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
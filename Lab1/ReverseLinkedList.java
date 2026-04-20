package basic;

import java.util.*;

public class ReverseLinkedList {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display original list
        System.out.println("Original List: " + list);

        // Reverse iteration using descendingIterator()
        Iterator<String> reverseIterator = list.descendingIterator();

        System.out.println("Reverse Order:");

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
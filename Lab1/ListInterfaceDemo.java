package basic;

import java.util.*;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        // Creating Lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Demonstrations ===");

        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding: " + arrayList);

        // Add at index
        arrayList.add(1, "Mango");
        System.out.println("After adding Mango: " + arrayList);

        // Add multiple
        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple: " + arrayList);

        // Get element
        System.out.println("First fruit: " + arrayList.get(0));

        // Update
        arrayList.set(1, "Kiwi");
        System.out.println("After update: " + arrayList);

        // Remove
        arrayList.remove("Orange");
        arrayList.remove(0);
        System.out.println("After remove: " + arrayList);

        // Search
        System.out.println("Contains Kiwi? " + arrayList.contains("Kiwi"));
        System.out.println("Index of Grape: " + arrayList.indexOf("Grape"));

        // Size
        System.out.println("Size: " + arrayList.size());

        // Loop
        System.out.println("\nFor-each:");
        for (String f : arrayList) {
            System.out.println(f);
        }

        // Iterator
        System.out.println("\nIterator:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Sort
        Collections.sort(arrayList);
        System.out.println("Sorted: " + arrayList);

        // Sublist
        System.out.println("Sublist: " + arrayList.subList(0, 2));

        // Clear
        arrayList.clear();
        System.out.println("After clear: " + arrayList);

        // ================= LinkedList =================

        System.out.println("\n=== LinkedList ===");

        LinkedList<String> fruits = new LinkedList<>();

        fruits.addFirst("Apple");
        fruits.addLast("Banana");
        fruits.add("Orange");

        System.out.println("List: " + fruits);
        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("After remove: " + fruits);
    }
}
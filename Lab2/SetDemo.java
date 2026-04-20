package basic2;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        // ================= HashSet =================
        System.out.println("=== HashSet Demonstration ===");

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        System.out.println("HashSet after adding elements: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("Contains 'Grape'? " + hashSet.contains("Grape"));

        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);


        // ================= TreeSet =================
        System.out.println("\n=== TreeSet Demonstration ===");

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Elephant");
        treeSet.add("Lion");
        treeSet.add("Tiger");
        treeSet.add("Zebra");

        System.out.println("TreeSet (automatically sorted): " + treeSet);


        // ================= LinkedHashSet =================
        System.out.println("\n=== LinkedHashSet Demonstration ===");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");

        System.out.println("LinkedHashSet (maintains insertion order): " + linkedHashSet);


        // ================= Set Operations =================
        System.out.println("\n=== Set Operations Demonstration ===");

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        // Union
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of sets: " + union);

        // Intersection
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of sets: " + intersection);

        // Difference
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of sets (set1 - set2): " + difference);


        // ================= Iteration =================
        System.out.println("\n=== Iteration Demonstration ===");

        System.out.println("Using for-each loop:");
        for (String item : hashSet) {
            System.out.println(item);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
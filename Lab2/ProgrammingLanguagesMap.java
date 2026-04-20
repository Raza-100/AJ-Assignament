package basic2;

import java.util.*;

public class ProgrammingLanguagesMap {

    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<String, Integer> programmingLanguages = new LinkedHashMap<>();

        // Add elements
        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("JavaScript", 1995);
        programmingLanguages.put("C++", 1985);

        // Print all elements
        System.out.println("Programming Languages and their release years:");

        for (Map.Entry<String, Integer> entry : programmingLanguages.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
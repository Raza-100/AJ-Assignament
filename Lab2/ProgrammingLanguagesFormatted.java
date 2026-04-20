package basic2;

import java.util.*;

public class ProgrammingLanguagesFormatted {

    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<String, Integer> programmingLanguages = new LinkedHashMap<>();

        // Add elements
        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("JavaScript", 1995);
        programmingLanguages.put("C++", 1985);

        // Print in required format
        for (Map.Entry<String, Integer> entry : programmingLanguages.entrySet()) {
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}
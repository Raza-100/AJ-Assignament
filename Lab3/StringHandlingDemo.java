package basic3;

import java.util.*;

public class StringHandlingDemo {

    public static void main(String[] args) {

        // String Creation
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length & Character
        System.out.println("\nLength: " + str1.length());
        System.out.println("Char at index 4: " + str1.charAt(4));

        // Comparison
        String str3 = "hello, world!";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Ignore Case: " + str1.equalsIgnoreCase(str3));

        // Searching
        System.out.println("\nIndex of 'World': " + str1.indexOf("World"));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // Substring
        System.out.println("\nSubstring(7): " + str1.substring(7));
        System.out.println("Substring(0,5): " + str1.substring(0,5));

        // Modification
        System.out.println("\nUpper: " + str1.toUpperCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // Trim
        String space = "  Java  ";
        System.out.println("\nTrim: '" + space.trim() + "'");

        // Concatenation
        System.out.println("\nConcat: " + "Hello".concat(" World"));

        // Split
        String csv = "Java,Python,C++";
        String[] arr = csv.split(",");
        System.out.println("\nSplit:");
        for(String s : arr){
            System.out.println(s);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("Learning Java");
        sb.append(" Programming");
        System.out.println("\nBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s Age: %d", "John", 25);
        System.out.println("\nFormatted: " + formatted);

        // Email Validation
        String email = "user@example.com";
        System.out.println("\nValid Email? " + validateEmail(email));
    }

    // Email validation method
    public static boolean validateEmail(String email){
        return email != null &&
               email.contains("@") &&
               email.contains(".") &&
               email.indexOf("@") < email.lastIndexOf(".") &&
               !email.startsWith("@") &&
               !email.endsWith(".");
    }
}
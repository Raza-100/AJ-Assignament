package basic3;

import java.util.*;

public class RemoveWhitespaceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);

        System.out.println("After removing whitespace: " + result);

        sc.close();
    }

    // User-defined function
    public static String removeWhitespace(String str) {

        if (str == null) return null;

        // Remove all whitespace characters
        return str.replaceAll("\\s", "");
    }
}
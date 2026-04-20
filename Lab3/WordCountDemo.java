package basic3;

import java.util.*;

public class WordCountDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = countWords(input);

        System.out.println("Number of words: " + count);

        sc.close();
    }

    // User-defined function
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) return 0;

        // Split by one or more spaces
        String[] words = str.trim().split("\\s+");

        return words.length;
    }
}
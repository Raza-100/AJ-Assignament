package basic3;

import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }

    // User-defined function
    public static boolean isPalindrome(String str) {

        if (str == null) return false;

        // Remove punctuation & spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
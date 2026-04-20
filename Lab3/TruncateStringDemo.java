package basic3;

import java.util.*;

public class TruncateStringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        String result = truncate(input, length);

        System.out.println("Result: " + result);

        sc.close();
    }

    // User-defined function
    public static String truncate(String str, int maxLength) {

        if (str == null) return null;

        // If string is already short
        if (str.length() <= maxLength) {
            return str;
        }

        // Cut and add ellipsis
        return str.substring(0, maxLength) + "...";
    }
}
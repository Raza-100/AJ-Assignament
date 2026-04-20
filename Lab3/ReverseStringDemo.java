package basic3;

import java.util.*;

public class ReverseStringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }

    // User-defined function
    public static String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
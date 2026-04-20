package basic3;

import java.util.*;

public class NumericCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNumeric(input)) {
            System.out.println("String contains only numeric characters ✅");
        } else {
            System.out.println("String is NOT numeric ❌");
        }

        sc.close();
    }

    // User-defined function
    public static boolean isNumeric(String str) {

        if (str == null || str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
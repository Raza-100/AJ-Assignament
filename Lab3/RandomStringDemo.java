package basic3;

import java.util.*;

public class RandomStringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of string: ");
        int length = sc.nextInt();

        String result = generateRandomString(length);

        System.out.println("Random String: " + result);

        sc.close();
    }

    // User-defined function
    public static String generateRandomString(int length) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();

        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            result.append(chars.charAt(index));
        }

        return result.toString();
    }
}
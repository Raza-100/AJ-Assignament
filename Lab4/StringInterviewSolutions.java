package Basic4;

import java.util.*;

public class StringInterviewSolutions {

    public static void main(String[] args) {

        System.out.println("1. Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println("2. Vowels: " + countVowels("Hello World"));

        System.out.println("3. Join: " + joinStrings(new String[]{"Java","is","fun"}, "-"));

        System.out.println("4. Alternate: " + alternateCharacters("abc","123"));

        System.out.println("5. Longest Substring: " + longestSubstringWithoutRepeating("abcabcbb"));

        System.out.println("6. First Non-Repeated: " + firstNonRepeatedCharacter("swiss"));

        System.out.println("7. Reverse Words: " + reverseWords("Java programming"));

        System.out.println("8. Remove Char: " + removeCharacter("programming",'m'));

        System.out.println("9. Substrings: " + generateSubstrings("abc"));

        System.out.println("10. Insert Space: " + insertSpaceAfterNChars("ABCDEFGHIJK",3));
    }

    // 1. Palindrome
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // 2. Count Vowels
    public static int countVowels(String s) {
        int count = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    // 3. Join Strings
    public static String joinStrings(String[] arr, String d) {
        return String.join(d, arr);
    }

    // 4. Alternate Characters
    public static String alternateCharacters(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int max = Math.max(s1.length(), s2.length());
        for(int i=0;i<max;i++){
            if(i<s1.length()) sb.append(s1.charAt(i));
            if(i<s2.length()) sb.append(s2.charAt(i));
        }
        return sb.toString();
    }

    // 5. Longest Substring
    public static String longestSubstringWithoutRepeating(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0,maxLen=0,maxStart=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=start){
                start=map.get(c)+1;
            }
            if(i-start+1>maxLen){
                maxLen=i-start+1;
                maxStart=start;
            }
            map.put(c,i);
        }
        return s.substring(maxStart,maxStart+maxLen);
    }

    // 6. First Non-Repeated
    public static Character firstNonRepeatedCharacter(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1) return e.getKey();
        }
        return null;
    }

    // 7. Reverse Words
    public static String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String w:words){
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    // 8. Remove Character
    public static String removeCharacter(String s,char c){
        return s.replace(String.valueOf(c),"");
    }

    // 9. Generate Substrings
    public static List<String> generateSubstrings(String s){
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        return list;
    }

    // 10. Insert Space
    public static String insertSpaceAfterNChars(String s,int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if((i+1)%n==0 && i<s.length()-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
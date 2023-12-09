package main.java.leetCodeQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramNo242 {
    public static void main(String[] args) {
        boolean anagram = isAnagram1("anagram", "nagaram");
        boolean anagram1=isAnagram("anagram", "nagaram");
        System.out.println(anagram);
        System.out.println(anagram1);
    }

    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chrArr1 = s.toCharArray();
        char[] chrArr2 = t.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : chrArr1) {
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else
                map1.put(c, 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : chrArr2) {
            if (map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else
                map2.put(c, 1);
        }

        if (!map1.equals(map2)) {
            return false;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t){
        char[] charS=s.toCharArray();
        char[] charT= t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return String.valueOf(charS).equals(String.valueOf(charT));
    }
}
